package J05025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Giangvien> ds = new ArrayList<>();
        int t = Integer.parseInt(input.nextLine());
        for (int i=0;i<t;i++){
            ds.add(new Giangvien(i, input.nextLine(), input.nextLine()));
        }
        Collections.sort(ds);
        for(Giangvien i:ds){
            System.out.println(i);
        }
    }
}
