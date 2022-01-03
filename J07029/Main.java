package J07029;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> ds = (ArrayList<Integer>) input.readObject();
        ArrayList<note> ds2= new ArrayList<>();
        HashMap<Integer,Integer> a = new HashMap<>();
        for(Integer i:ds){
            if(prime(i)){
                if (a.containsKey(i)){
                    a.put(i,a.get(i)+1);
                }
                else {
                    a.put(i,1);
                }
            }
        }
        for(Integer i:a.keySet()){
            ds2.add(new note(i,a.get(i)));
        }
        Collections.sort(ds2);
        for(int i = 0;i<10;i++){
            System.out.println(ds2.get(i));
        }
    }
    public static boolean prime(int n){
        if(n<2) return false;
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
