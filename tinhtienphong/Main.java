package tinhtienphong;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
//        Scanner input = new Scanner(new File("KHACHHANG.in"));
        Scanner input = new Scanner(System.in);
        ArrayList<tien> ds = new ArrayList<>();
        int t = Integer.parseInt(input.nextLine());
        for(int i = 0;i<t;i++){
            String name = input.nextLine();
            String sophong = input.nextLine();
            String ngaynhan = input.nextLine();
            String ngaytra = input.nextLine();
            int bo = Integer.parseInt(input.nextLine());
            ds.add(new tien(i,name,sophong,ngaynhan,ngaytra,bo));
        }
        Collections.sort(ds);
        for(tien i:ds){
            System.out.println(i);
        }
    }
}
