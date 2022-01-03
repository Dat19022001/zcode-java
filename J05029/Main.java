package J05029;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<dsThuctap> ds = new ArrayList<>();
        int t = Integer.parseInt(input.nextLine());
        for(int i=0;i<t;i++){
            ds.add(new dsThuctap(input.nextLine(), input.nextLine(), Integer.parseInt(input.nextLine())));
        }
        Collections.sort(ds);
        int n = Integer.parseInt(input.nextLine());
        for(int i = 0;i<n;i++){
            int a = Integer.parseInt(input.next());
            int b = Integer.parseInt(input.next());
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+a+" DEN "+b+" SINH VIEN:");
            for(dsThuctap j:ds){
                if(j.getSoluong()>=a && j.getSoluong()<=b){
                    System.out.println(j);
                }
            }
        }
    }
}
