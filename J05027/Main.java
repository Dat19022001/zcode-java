package J05027;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<timkiemGV> ds = new ArrayList<>();
        int t = Integer.parseInt(input.nextLine());
        for(int i= 0;i<t;i++){
            ds.add(new timkiemGV(i,input.nextLine(),input.nextLine()));
        }
        int n = Integer.parseInt(input.nextLine());
        for(int i = 0;i<n;i++){
            String a = input.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA "+a+":");
            for(timkiemGV m:ds){
                if(m.search(a)){
                    System.out.println(m);
                }
            }
        }
    }
}
