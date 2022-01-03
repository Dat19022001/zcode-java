package J05074;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<SinhVien> ds = new ArrayList<>();
        ArrayList<Diemdanh> ds1 = new ArrayList<>();
        int n = Integer.parseInt(input.nextLine());
        for (int i = 0;i<n;i++){
            ds.add(new SinhVien(input.nextLine(), input.nextLine(), input.nextLine()));
        }
        for(int i =0;i<n;i++){
            String ma = input.next();
            String danh = input.next();
            input.nextLine();
            String lop="",name="";
            for(SinhVien j:ds){
                if(j.getMaSV().equals(ma)){
                    name = j.getName();
                    lop=j.getLop();
                    ds1.add(new Diemdanh(j.getMaSV(),name,lop,danh));
                    break;
                }
            }
        }
        String malop = input.nextLine();
        for(SinhVien i:ds){
            if(i.getLop().equals(malop)){
                for(Diemdanh j:ds1){
                    if(i.getMaSV().equals(j.getMaSV())){
                        System.out.println(j);
                    }
                }
            }
        }
    }
}
