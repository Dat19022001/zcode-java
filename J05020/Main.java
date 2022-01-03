package J05020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<dsSinhvien> ds = new ArrayList<>();
        while(input.hasNext()){
            ds.add(new dsSinhvien(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Collections.sort(ds);
        for(dsSinhvien i:ds){
            System.out.println(i);
        }
    }
}
