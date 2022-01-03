package J07011;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("VANBAN.in"));
        HashMap<String,Integer> ds = new HashMap<>();
        int n = Integer.parseInt(input.nextLine());
        while (n-->0){
            while (input.hasNextLine()){
                String [] arr = input.nextLine().toLowerCase().split("\\W+");
                for(String j:arr){
                    if(ds.containsKey(j)){
                        ds.put(j,ds.get(j)+1);
                    }
                    else ds.put(j,1);
                }
            }
        }
        ArrayList<Tu> ds1 = new ArrayList<>();
        for(String i:ds.keySet()){
            if(!i.equals("")){
                ds1.add(new Tu(i,ds.get(i)));
            }
        }
        Collections.sort(ds1);
        for(Tu i:ds1){
            System.out.println(i);
        }
    }
}
