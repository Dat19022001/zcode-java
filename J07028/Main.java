package J07028;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input1 = new Scanner(new File("MONHOC.in"));
        Scanner input2 = new Scanner(new File("GIANGVIEN.in"));
        ArrayList<MH> ds1 = new ArrayList<>();
        ArrayList<GV> ds2 = new ArrayList<>();
        int t = Integer.parseInt(input1.nextLine());
        for(int i=0;i<t;i++){
            ds1.add(new MH(input1.next(), input1.nextLine()));
        }
        int n = Integer.parseInt(input2.nextLine());
        for(int i=0;i<n;i++){
            ds2.add(new GV(input2.next(),input2.nextLine().trim()));
        }
        Scanner input3 = new Scanner(new File("GIOCHUAN.in"));
        ArrayList<RA> ds3 = new ArrayList<>();
        int h = Integer.parseInt(input3.nextLine());
        for(int i = 0;i<h;i++){
            String ma = input3.next();
            String maMH = input3.next();
            Float gio = Float.parseFloat(input3.next());
            for(GV j:ds2){
                if(ma.equals(j.getMa())){
                    for(MH w:ds1){
                        if(maMH.equals(w.getMaMH())){
                            ds3.add(new RA(j.getMa(),j.getTenGV(),w.getMaMH(), w.getTenMH(), gio));
                        }
                    }
                }
            }
        }
        HashMap<String,Float> s = new HashMap<>();
        for(RA i:ds3){
            if(s.containsKey(i.getTenGV())){
                s.put(i.getTenGV(),s.get(i.getTenGV())+i.getGio());
            }
            else s.put(i.getTenGV(),i.getGio());
        }
        for(String i:s.keySet()){
            System.out.println(i+" "+String.format("%.2f",s.get(i)));
        }
    }
}
