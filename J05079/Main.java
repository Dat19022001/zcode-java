package J05079;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Sinhvien> ds =new ArrayList<>();
        int n = Integer.parseInt(input.nextLine());
        for(int i =0;i<n;i++){
            ds.add(new Sinhvien(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Collections.sort(ds);
        int t = Integer.parseInt(input.nextLine());
        for(int i =0;i<t;i++){
            String ma = input.nextLine();
            for(Sinhvien j:ds){
                if(j.getTenGV().equals(ma)){
                    System.out.println("Danh sach cho giang vien " + j.getTenGV() +":");
                    break;
                }
            }
            for (Sinhvien h:ds){
                if(h.getTenGV().equals(ma)){
                    System.out.println(h);
                }
            }
        }
    }
}
