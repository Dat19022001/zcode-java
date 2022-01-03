package J07036;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static ArrayList<BĐL> ds3 = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("SINHVIEN.in"));
        ArrayList<HS> ds1 = new ArrayList<>();
        int n = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++) {
            ds1.add(new HS(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Scanner input1 = new Scanner(new File("MONHOC.in"));
        ArrayList<MH> ds2 = new ArrayList<>();
        int t = Integer.parseInt(input1.nextLine());
        for (int i = 0; i < t; i++) {
            ds2.add(new MH(input1.nextLine(), input1.nextLine(), Integer.parseInt(input1.nextLine())));
        }
        Scanner input2 = new Scanner(new File("BANGDIEM.in"));
        int h = Integer.parseInt(input2.nextLine());
        for (int i = 0; i < h; i++) {
            String ma = input2.next();
            String mamh = input2.next();
            float diem = Float.parseFloat(input2.next());
            input2.nextLine();
            String mon = "";
            int tinchi = 0;
            for (MH k : ds2) {
                if (mamh.equals(k.getMa())) {
                    mon = k.getMon();
                    tinchi = k.getTinchi();
                    break;
                }
            }
            for (HS j : ds1) {
                if (ma.equals(j.getMaSV())) {
                    ds3.add(new BĐL(j.getMaSV(), j.getName(), j.getLop(), mamh, mon, tinchi, diem));
                }
            }
        }
        Collections.sort(ds3);
        int m = Integer.parseInt(input2.nextLine());
        for(int i =0;i<m;i++){
            String k = input2.nextLine();
            System.out.println("BANG DIEM lop "+searchlop(k)+":");
            for(BĐL c:ds3){
                if(k.equals(c.getLop())){
                    System.out.println(c);
                }
            }
        }
    }
    static String searchlop(String a){
        for(BĐL j:ds3){
            if(a.equals(j.getLop())){
                return j.getLop();
            }
        }
        return null;
    }
}
