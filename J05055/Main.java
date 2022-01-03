package J05055;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        ArrayList<thanhtich> ds = new ArrayList<>();
        ArrayList<rank> ds1 = new ArrayList<>();
        int n= Integer.parseInt(input.nextLine());
        for(int i =0;i<n;i++){
            ds.add(new thanhtich(i, input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }
        for (thanhtich i:ds){
            ds1.add(new rank(i.getId(),i.getName(),i.thanh(),i.uuTien(),i.ketQua(),tt(ds,i)));
        }
        Collections.sort(ds1);
        for(rank i:ds1){
            System.out.println(i);
        }
    }
    static int tt(ArrayList<thanhtich> ds, thanhtich x) {
        int dem = 1;
        for (thanhtich i: ds) {
            if(!i.equals(x)) {
                if(x.ketQua().compareTo(i.ketQua()) > 0) {
                    dem++;
                }
            }
        }
        return dem;
    }
}
