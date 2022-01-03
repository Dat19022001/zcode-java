package J05012;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<hoadon> ds = new ArrayList<>();
        int t = Integer.parseInt(input.nextLine());
        for(int i = 0;i<t;i++){
            ds.add(new hoadon(input.nextLine(), input.nextLine(),Integer.parseInt(input.nextLine()),Long.parseLong(input.nextLine()),Long.parseLong(input.nextLine())));
        }
        Collections.sort(ds);
        for(hoadon i:ds){
            System.out.println(i);
        }
    }
}
