package J05043;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<TinhLuong> ds1 = new ArrayList<>();
        int t = Integer.parseInt(input.nextLine());
        for(int i= 0;i<t;i++){
            TinhLuong ds = new TinhLuong(i,input.nextLine(),input.nextLine(),Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine()));
            ds1.add(ds);
        }
        Collections.sort(ds1);
        for(TinhLuong i:ds1){
            System.out.println(i);
        }
    }
}
