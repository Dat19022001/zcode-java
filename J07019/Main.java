package J07019;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("DATA1.in"));
        Scanner input1 = new Scanner(new File("DATA2.in"));
        ArrayList<HH> ds = new ArrayList<>();
        ArrayList<TT> ds1 = new ArrayList<>();
        int n = Integer.parseInt(input.nextLine());
        for(int i = 0;i<n;i++){
            ds.add(new HH(input.nextLine(),input.nextLine(),Long.parseLong(input.nextLine()),Long.parseLong(input.nextLine())));
        }
        int t = Integer.parseInt(input1.nextLine());
        for(int i = 0;i<t;i++){
            String ma1 = input1.next();
            long sl = Long.parseLong(input1.next());
            for(HH j:ds){
                if(ma1.substring(0,2).equals(j.getMa())){
                    ds1.add(new TT(i,ma1,j.getTen(),sl,j.getGialoai1(),j.getGialoai2()));
                }
            }
        }
        for(TT i:ds1){
            System.out.println(i);
        }
    }
}
