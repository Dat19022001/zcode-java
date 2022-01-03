package Xettuyen;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
//        Scanner input = new Scanner(new File("XETTUYEN.in"));
        Scanner input = new Scanner(System.in);
        ArrayList<tinh> ds1 = new ArrayList<>();
        int t = Integer.parseInt(input.nextLine());
        for(int i=0;i<t;i++){
            String name = input.nextLine();
            String ngaysinh = input.nextLine();
            float mon1=Float.parseFloat(input.nextLine());
            float mon2= Float.parseFloat(input.nextLine());
            tinh ds = new tinh(i,name,ngaysinh,mon1,mon2);
            ds1.add(ds);
        }
        Collections.sort(ds1);
        for(tinh i:ds1){
            System.out.println(i);
        }
    }
}
