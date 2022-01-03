package J05028;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<thuctap> ds = new ArrayList<>();
        int t = Integer.parseInt(input.nextLine());
        for(int i=0;i<t;i++){
            ds.add(new thuctap(input.nextLine(), input.nextLine(), Integer.parseInt(input.nextLine())));
        }
        Collections.sort(ds);
        for(thuctap i:ds){
            System.out.println(i);
        }
    }
}
