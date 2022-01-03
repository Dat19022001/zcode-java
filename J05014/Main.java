package J05014;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<TuyenGV> ds = new ArrayList<>();
        int t = Integer.parseInt(input.nextLine());
        for(int i = 0;i<t;i++){
            ds.add(new TuyenGV(i,input.nextLine(), input.nextLine(),Double.parseDouble(input.nextLine()),Double.parseDouble(input.nextLine())));
        }
        Collections.sort(ds);
        for(TuyenGV i:ds){
            System.out.println(i);
        }
    }
}
