import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class J07032 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream input1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream input2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> ds1 = (ArrayList<Integer>) input1.readObject();
        ArrayList<Integer> ds2 = (ArrayList<Integer>) input2.readObject();
        HashMap<Integer,Integer> s1 = new HashMap<>();
        HashMap<Integer,Integer> s2 = new HashMap<>();
        for(Integer i:ds1){
            if(check(i)){
                if(s1.containsKey(i)){
                    s1.put(i,s1.get(i)+1);
                }
                else s1.put(i,1);
            }
        }
        for(Integer i:ds2){
            if(check(i)){
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
        int j=0;
        for(Integer i:ds3){
            if(j==10) break;
            System.out.println(i+" "+(s1.get(i)+s2.get(i)));
            j++;
        }
    }
    static boolean check(int x){
        String a = String.valueOf(x);
        StringBuilder res = new StringBuilder();
        res.append(a);
        if(!res.toString().equals(res.reverse().toString()))
            return false;
        if(a.length() % 2 == 0)
            return false;
        for(int i=0;i<a.length();i++){
            if(Integer.parseInt(String.valueOf(a.charAt(i)))%2==0)
                return false;
        }
        return true;
    }
}
