package J05081;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<hang> ds = new ArrayList<>();
        int n = Integer.parseInt(input.nextLine());
        for(int i =0;i<n;i++){
            String name = input.nextLine();
            String donvi = input.nextLine();
            int giamua = Integer.parseInt(input.nextLine());
            int giaban = Integer.parseInt(input.nextLine());
            ds.add(new hang(i,name,donvi,giamua,giaban));
        }
        Collections.sort(ds);
        for(hang i:ds){
            System.out.println(i);
        }
    }
}
