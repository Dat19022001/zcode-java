package J07047;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner input = new Scanner(new File("DATA.in"));
        ArrayList<Phong> ds1 = new ArrayList<>();
        ArrayList<Nguoi> ds2 = new ArrayList<>();
        ArrayList<gia> ds3 = new ArrayList<>();
        int t = Integer.parseInt(input.nextLine());
        for(int i=0;i<t;i++){
            ds1.add(new Phong(input.next(), input.next(), Float.parseFloat(input.next()),Float.parseFloat(input.next())));
            input.nextLine();
        }
        int n = Integer.parseInt(input.nextLine());
        for(int i =0;i<n;i++){
            ds2.add(new Nguoi(i, input.nextLine(), input.nextLine(), input.nextLine(),input.nextLine()));
        }
        for(Nguoi i:ds2){
            String a = i.getMaP().substring(2,3);
            for(Phong j:ds1){
                if(a.equals(j.getKiHieu())){
                    ds3.add(new gia(i.getId(),i.getName(),i.getMaP(),i.getNgayden(),i.getNgaydi(), j.getDongia(), j.getPhiphucvu()));
                }
            }
        }
        Collections.sort(ds3);
        for(gia i:ds3){
            System.out.println(i);
        }
    }
}
