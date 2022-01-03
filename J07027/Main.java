package J07027;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input1 = new Scanner(new File("SINHVIEN.in"));
        Scanner input2 = new Scanner(new File("BAITAP.in"));
        Scanner input3 = new Scanner(new File("NHOM.in"));
        ArrayList<SV> ds1 = new ArrayList();
        ArrayList<BTL> ds2 = new ArrayList();
        ArrayList<NHOM> ds3 = new ArrayList();
        int t = Integer.parseInt(input1.nextLine());
        for(int i =0;i<t;i++){
            ds1.add(new SV(input1.nextLine(),input1.nextLine(),input1.nextLine()));
        }
        int n = Integer.parseInt(input2.nextLine());
        for(int i =0;i<n;i++){
            ds2.add(new BTL(i,input2.nextLine()));
        }
        for(int k =0;k<t;k++){
            String maSV = input3.next();
            String id = input3.next();
            for(SV i:ds1){
                if(i.getMaSv().equals(maSV)){
                    for(BTL j:ds2){
                        if(j.getId().equals(id)){
                            ds3.add(new NHOM(maSV,i.getName(),i.getSdt(),id,j.getTenBT()));
                        }
                    }
                }
            }
        }
        Collections.sort(ds3);
        for(NHOM i:ds3){
            System.out.println(i);
        }
    }
}
