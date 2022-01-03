package J07057;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("THISINH.in"));
        int t = Integer.parseInt(input.nextLine());
        ArrayList<dotruot> ds = new ArrayList<>();
        for(int i = 0;i<t;i++){
            ds.add(new dotruot(i,input.nextLine(),Float.parseFloat(input.nextLine()),input.nextLine(),input.nextLine()));
        }
        Collections.sort(ds);
        for(dotruot i:ds){
            System.out.println(i);
        }
    }
}
