package DSMonthi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("MONHOC.in"));
        ArrayList<DS> ds1 = new ArrayList<>();
        int t = Integer.parseInt(input.nextLine());
        for(int i = 0;i<t;i++){
            ds1.add(new DS(input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Collections.sort(ds1);
        for(DS i:ds1){
            System.out.println(i);
        }
    }
}
