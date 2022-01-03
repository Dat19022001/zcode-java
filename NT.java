import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class NT {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream input1 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> ds = (ArrayList<Integer>) input.readObject();
        ArrayList<Integer> ds1 = (ArrayList<Integer>) input1.readObject();
        TreeMap<Integer,Integer> s = new TreeMap<>();
        TreeMap<Integer,Integer> s1 = new TreeMap<>();
        for(Integer i:ds){
            if(s.containsKey(i)){
                s.put(i,s.get(i)+1);
            }
            else s.put(i,1);
        }
        for(Integer i:ds1){
            if(s1.containsKey(i)){
                s1.put(i,s1.get(i)+1);
            }
            else s1.put(i,1);
        }
        ArrayList<Integer> ds2 = new ArrayList<>();
        for(Integer i:s.keySet()){
            if(s1.containsKey(i)){
                ds2.add(i);
            }
        }
        Collections.sort(ds2);
        for(Integer i:ds2){
            if(prime(i)){
                System.out.println(i+" "+s.get(i)+" "+s1.get(i));
            }
        }
    }
    static boolean prime(Integer t){
        if(t<2) return false;
        for(int i = 2;i<=Math.sqrt(t);i++){
            if(t%i==0) {
                return false;
            }
        }
        return true;
    }
}