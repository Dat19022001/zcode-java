import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class J07030 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream input1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream input2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> ds1 = (ArrayList<Integer>) input1.readObject();
        ArrayList<Integer> ds2 = (ArrayList<Integer>) input2.readObject();
        SortedSet<Integer> s1 = new TreeSet<>();
        SortedSet<Integer> s2 = new TreeSet<>();
        for(Integer i:ds1){
            if(prime(i)){
                s1.add(i);
            }
        }
        for(Integer i:ds2){
            if (prime(i)){
                s2.add(i);
            }
        }
        for(Integer i:s1){
            if((i*2<1000000) && !s2.contains(1000000-i)&& s1.contains(1000000-i)&&!s2.contains(i)){
                System.out.println(i+" "+(1000000-i));
            }
        }
    }
    static boolean prime(Integer a){
        if(a<2) return false;
        for(int i = 2;i<=Math.sqrt(a);i++){
            if(a%i==0) return false;
        }
        return true;
    }
}
