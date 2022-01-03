

import java.io.*;
import java.util.*;

public class J07040 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String>  ds = (ArrayList<String>) input.readObject();
        Scanner input1 = new Scanner(new File("VANBAN.in"));
        Set<String> ds1 =new HashSet<>();
        Set<String> ds2 = new LinkedHashSet<>();
        for(String i:ds){
            String [] tu = i.toLowerCase().split("\\s+");
            for(String j:tu){
                ds1.add(j);
            }
        }
        while (input1.hasNext()){
            String a = input1.next().toLowerCase();
            if (ds1.contains(a)){
                ds2.add(a);
            }
        }
        for(String i:ds2){
            System.out.println(i);
        }
    }
}
