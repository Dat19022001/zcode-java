package J07054;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static ArrayList<thutu> ds = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.parseInt(input.nextLine());
        for(int i = 0;i<t;i++){
            String name = input.nextLine();
            int mon1 = Integer.parseInt(input.nextLine());
            int mon2 = Integer.parseInt(input.nextLine());
            int mon3 = Integer.parseInt(input.nextLine());
            ds.add(new thutu(i,name,mon1,mon2,mon3));
        }
        Collections.sort(ds);
        for(thutu i:ds){
            System.out.println(i+" "+stt(i.trungbinh()));
        }
    }
    public static int stt(float x) {
        for (int i = 0; i < ds.size(); i++) {
            if (x == ds.get(i).trungbinh()) {
                return i + 1;
            }
        }
        return 0;
    }
}
