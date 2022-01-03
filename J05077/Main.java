package J05077;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<phong> ds = new ArrayList<>();
        ArrayList<TL> ds1 = new ArrayList<>();
        int t = Integer.parseInt(input.nextLine());
        for(int i=0;i<t;i++){
            ds.add(new phong(input.next(), input.nextLine()));
        }
        int n = Integer.parseInt(input.nextLine());
        for(int i =0;i<n;i++){
            String ma = input.nextLine();
            String name = input.nextLine();
            String phong="";
            int lcb = Integer.parseInt(input.nextLine());
            int ngaycong = Integer.parseInt(input.nextLine());
            for(phong j:ds){
                if(j.getMaPhong().equals(ma.substring(3))){
                    phong=j.getTenphong();
                }
            }
            ds1.add(new TL(ma,name,phong,lcb,ngaycong));
        }
        String ma1 = input.nextLine();
        for (phong i:ds){
            if(i.getMaPhong().equals(ma1)){
                System.out.println("Bang luong phong "+i.getTenphong()+":");
                for(TL j:ds1){
                    if(ma1.equals(j.getMa().substring(3))){
                        System.out.println(j);
                    }
                }
            }
        }

    }
}
