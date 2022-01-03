package J05038;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());
        ArrayList<tienLuong> ds1= new ArrayList<>();
        for(int i = 0;i<n;i++){
            tienLuong ds = new tienLuong(i, input.nextLine(),Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine()), input.nextLine());
            ds1.add(ds);
        }
        Collections.sort(ds1);
        for(tienLuong i:ds1){
            System.out.println(i);
        }
    }
}
