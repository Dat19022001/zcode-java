package tinhluong;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<phong1> ds = new ArrayList<>();
        ArrayList<tinhluong1> ds1 = new ArrayList<>();
        int t = Integer.parseInt(input.nextLine());
        for(int i=0;i<t;i++){
            ds.add(new phong1(input.next(), input.nextLine()));
        }
        int n = Integer.parseInt(input.nextLine());
        for(int i =0;i<n;i++){
            String ma = input.nextLine();
            String name = input.nextLine();
            String phong="";
            int lcb = Integer.parseInt(input.nextLine());
            int ngaycong = Integer.parseInt(input.nextLine());
            for(phong1 j:ds){
                if(j.getMaPhong().equals(ma.substring(3))){
                    phong=j.getTenphong();
                }
            }
            ds1.add(new tinhluong1(ma,name,phong,lcb,ngaycong));
        }
        for (tinhluong1 i:ds1){
            System.out.println(i);
        }

    }
}
