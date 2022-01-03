package J05034;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<DSTT> ds = new ArrayList<>();
        int t = Integer.parseInt(input.nextLine());
        for(int i = 0;i< t;i++){
            ds.add(new DSTT(i, input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()));
        }
        Collections.sort(ds);
        int n = Integer.parseInt(input.nextLine());
        for(int i = 0;i<n;i++){
            String a = input.nextLine();
            for(DSTT j:ds){
                if(j.getDN().equals(a)){
                    System.out.println(j);
                }
            }
        }
    }
}
