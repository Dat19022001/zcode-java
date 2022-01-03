package J05023;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<dsKhoa> ds = new ArrayList<>();
        int n = Integer.parseInt(input.nextLine());
        for(int i = 0;i<n;i++){
            ds.add(new dsKhoa(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }
        int t = Integer.parseInt(input.nextLine());
        for(int i = 0;i<t;i++){
            String a = input.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA "+a+":");
            for(dsKhoa j:ds){
                if(kiemtra(j.getLop(),a)){
                    System.out.println(j);
                }
            }
        }
    }
    public static Boolean kiemtra(String a,String b){
        String a1 = a.substring(1,3);
        String b1 = b.substring(2,4);
        if (a1.equals(b1)) return true;
        return false;
    }

}
