
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;


public class J07061 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream input1 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> ds = (ArrayList<Integer>) input.readObject();
        ArrayList<Integer> ds1 = (ArrayList<Integer>) input1.readObject();
        TreeMap<Integer,Integer> s1 = new TreeMap<>();
        TreeMap<Integer,Integer> s2 = new TreeMap<>();
        for(Integer i:ds){
            if(s1.containsKey(i)){
                s1.put(i,s1.get(i)+1);
            }
            else s1.put(i,1);
        }
        for(Integer i:ds1){
            if(s2.containsKey(i)){
                s2.put(i,s2.get(i)+1);
            }
            else s2.put(i,1);
        }
        ArrayList<Integer> ds3 = new ArrayList<>();
        for(Integer i:s1.keySet()){
            if(check(i)&& s2.containsKey(i))
                ds3.add(i);
        }
        Collections.sort(ds3);
        for(Integer i:ds3){
            System.out.println(i+" "+s1.get(i)+" "+s2.get(i));
        }
    }
    static boolean check(int i){
        String a = String.valueOf(i);
        if(a.length()<=1) return false;
        for(int j =0;j<a.length()-1;j++){
            if(Integer.parseInt(String.valueOf(a.charAt(j)))>Integer.parseInt(String.valueOf(a.charAt(j+1))))
                return false;
        }
        return true;
    }
}
