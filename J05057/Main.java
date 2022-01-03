package J05057;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = Integer.parseInt(input.nextLine());
        ArrayList<dsTT> ds1 = new ArrayList<>();
        for(int i = 0;i< t;i++){
            dsTT ds = new dsTT(input.nextLine(), input.nextLine(), Float.parseFloat(input.nextLine()),Float.parseFloat(input.nextLine()),Float.parseFloat(input.nextLine()));
            ds1.add(ds);
        }
        Collections.sort(ds1);
        for(dsTT i:ds1){
            System.out.println(i);
        }
    }
}
