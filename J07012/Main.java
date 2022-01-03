package J07012;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> ds =(ArrayList<String>) input.readObject();
        HashMap<String,Integer> ds1 = new HashMap<>();
        for(String i:ds){
            String [] m= i.toLowerCase().split("\\W+");
            for(String j:m){
                if(ds1.containsKey(j)){
                    ds1.put(j,ds1.get(j)+1);
                }
                else ds1.put(j,1);
            }

        }
        ArrayList<NP> ds2 = new ArrayList<>();
        for(String i:ds1.keySet()){
            if(!i.equals("")){
                ds2.add(new NP(i,ds1.get(i)));
            }
        }
        Collections.sort(ds2);
        for(NP i:ds2){
            System.out.println(i);
        }
    }
}
