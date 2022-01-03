package J07049;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner input = new Scanner(new File("MUAHANG.in"));
        ArrayList<HH> ds1 = new ArrayList<>();
        ArrayList<NM> ds2 = new ArrayList<>();
        ArrayList<IN> ds3 = new ArrayList<>();
        int t = Integer.parseInt(input.nextLine());
        for(int i = 0;i<t;i++){
            ds1.add(new HH(input.nextLine(), input.nextLine(),Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine())));
        }
        int n = Integer.parseInt(input.nextLine());
        for(int i =0;i<n;i++){
            ds2.add(new NM(i, input.nextLine(), input.nextLine(), input.nextLine(), Integer.parseInt(input.nextLine()), input.nextLine()));
        }
        for (HH i:ds1){
            for (NM j:ds2){
                if(i.getMaSP().equals(j.getMaSP())){
                    ds3.add(new IN(j.getId(),j.getTenKH(), j.getDiachi(),j.getSl(),j.getNgaymua(),i.getMaSP(),i.getTen(),i.getGia(),i.getThoihan()));
                }
            }
        }
        Collections.sort(ds3);
        for(IN i:ds3){
            System.out.println(i);
        }
    }
}
