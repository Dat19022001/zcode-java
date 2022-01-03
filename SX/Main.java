package SX;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner input1 = new Scanner(new File("MONTHI.in"));
        Scanner input2 = new Scanner(new File("CATHI.in"));
        Scanner input3 = new Scanner(new File("LICHTHI.in"));
        ArrayList<in> ds1 = new ArrayList<>();
        ArrayList<Mon> ds2 = new ArrayList<>();
        ArrayList<SV> ds3 = new ArrayList<>();
        int t = Integer.parseInt(input1.nextLine());
        for(int i = 1;i<=t;i++){
            ds2.add(new Mon(input1.nextLine(),input1.nextLine(),input1.nextLine()));
        }
        int m = Integer.parseInt(input2.nextLine());
        for(int i =1;i<=m;i++){
            ds1.add(new in(i,input2.nextLine(),input2.nextLine(),input2.nextLine()));
        }
        int h = Integer.parseInt(input3.nextLine());
        for(int i =0;i<h;i++){
            String ma = input3.next();
            String maMH = input3.next();
            String maSV = input3.next();
            String soSv = input3.nextLine().trim();
            for(in j:ds1){
                if(j.getId().equals(ma)){
                    for(Mon w:ds2){
                        if(maMH.equals(w.getMa())){
                            ds3.add(new SV(ma,maMH,maSV,soSv,w.getTenM(),w.getHt(),j.getNgay(),j.getGio(),j.getPhong()));
                        }
                    }
                }
            }
        }
        Collections.sort(ds3);
        for(SV i:ds3){
            System.out.println(i);
        }
    }
}
