package J05026;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<dsGiangvienNganh> ds = new ArrayList<>();
        int t = Integer.parseInt(input.nextLine());
        for(int i= 0;i<t;i++){
            ds.add(new dsGiangvienNganh(i,input.nextLine(),input.nextLine()));
        }
        int n = Integer.parseInt(input.nextLine());
        for(int i = 0;i<n;i++){
            String a = input.nextLine();
            String [] res = a.split("\\s+");
            String ten = "";
            for(String j:res){
                ten +=j.charAt(0);
            }
            System.out.println("DANH SACH GIANG VIEN BO MON "+ten.toUpperCase()+":");
            for(dsGiangvienNganh m:ds){
                if(m.getNganh().equals(a)){
                    System.out.println(m);
                }
            }
        }
    }
}
