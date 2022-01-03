package J05018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<tb> ds = new ArrayList<>();
        for(int i = 0;i<n;i++){
            ds.add(new tb(i,input.nextLine(), input.nextLine()));
        }
        Collections.sort(ds);
        for(tb i:ds){
            System.out.println(i);
        }
    }

}
