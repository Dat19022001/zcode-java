package J05059;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner input = new Scanner(System.in);
        Scanner input = new Scanner(new File("THISINH.in"));
        int n= Integer.parseInt(input.nextLine());
        ArrayList<trungtuyen> ds1= new ArrayList<>();
        for(int i = 0;i<n;i++){
            trungtuyen ds = new trungtuyen(input.nextLine(), input.nextLine(), Float.parseFloat(input.nextLine()),Float.parseFloat(input.nextLine()),Float.parseFloat(input.nextLine()));
            ds1.add(ds);
        }
        Collections.sort(ds1);
        int t = Integer.parseInt(input.nextLine());

        float a = ds1.get(t-1).tong();
        System.out.println(String.format("%.1f", a));
        for (trungtuyen i:ds1){
            if(i.tong()>=a)
                System.out.println(i+" "+"TRUNG TUYEN");
            else
                System.out.println(i+" "+"TRUOT");
        }

    }
}
