package J05082;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        ArrayList<Khachhang> ds = new ArrayList<>();
        int t = Integer.parseInt(input.nextLine());
        for(int i = 0;i<t;i++){
            ds.add(new Khachhang(i, input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Collections.sort(ds);
        for(Khachhang i:ds){
            System.out.println(i);
        }
    }
}
