package J07048;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<sanpham> ds = new ArrayList<>();
        Scanner input = new Scanner(new File("SANPHAM.in"));
        int t = Integer.parseInt(input.nextLine());
        for(int i = 1;i<=t;i++){
            ds.add(new sanpham(input.nextLine(), input.nextLine(), Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine())));
        }
        Collections.sort(ds);
        for (sanpham i:ds){
            System.out.println(i);
        }
    }
}
