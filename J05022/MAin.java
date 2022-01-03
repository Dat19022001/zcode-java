package J05022;


import java.util.ArrayList;
import java.util.Scanner;

public class MAin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<dsLop> ds = new ArrayList<>();
        int t = Integer.parseInt(input.nextLine());
        for(int i = 0;i<t;i++){
            ds.add(new  dsLop(input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()));
        }
        int h = Integer.parseInt(input.nextLine());
        for(int i =0;i<h;i++){
            String a = input.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP "+a+":");
            for(dsLop j:ds){
                if(j.getLop().equals(a)){
                    System.out.println(j);
                }
            }
        }
    }
}
