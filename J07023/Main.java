package J07023;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ipnut1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream input2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> ds1 = (ArrayList<Integer>) ipnut1.readObject();
        ArrayList<Integer> ds2 = (ArrayList<Integer>) input2.readObject();
        HashMap<Integer,Integer> s1 = new HashMap<>();
        HashMap<Integer,Integer> s2 = new HashMap<>();
        for(Integer i:ds1){
            if(prime(i)&&thuannghich(i)){
                if(s1.containsKey(i)){
                    s1.put(i,s1.get(i)+1);
                }
                else s1.put(i,1);
            }
        }
        for(Integer i:ds2){
            if(prime(i)&&thuannghich(i)){
                if(s2.containsKey(i)){
                    s2.put(i,s2.get(i)+1);
                }
                else s2.put(i,1);
            }
        }
        ArrayList<Integer> ds3 = new ArrayList<>();
        for(Integer i:s1.keySet()){
            if(s2.containsKey(i)){
                ds3.add(i);
            }
        }
        Collections.sort(ds3);
        for(Integer i:ds3){
            System.out.println(i+" "+s1.get(i)+" "+s2.get(i));
        }

    }
    static boolean prime(Integer i){
        if(i<2) return false;
        for(int j=2;j<=Math.sqrt(i);j++){
            if(i%j==0) return false;
        }
        return true;
    }
    static boolean thuannghich(Integer i){
        StringBuilder res = new StringBuilder();
        res.append(i);
        if(res.toString().equals(res.reverse().toString()))
            return true;
        return false;
    }
}
