package J05024;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<dsNganh> ds = new ArrayList<>();
        int n = Integer.parseInt(input.nextLine());
        for (int i = 0;i<n;i++){
            ds.add(new dsNganh(input.nextLine(),input.nextLine(),input.nextLine(), input.nextLine()));
        }
        int h = Integer.parseInt(input.nextLine());
        for(int i = 0;i<h;i++){
            String a = input.nextLine().toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH "+a+":");
            for(dsNganh j:ds){
                if(j.getLop()=='E'&& (a.charAt(0)=='C'||a.charAt(0)=='A'))
                    continue;
                if(j.getId().equals(a.charAt(0))){
                    System.out.println(j);
                }
            }
        }

    }
}
