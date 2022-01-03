package J05033;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<thoigian> ds = new ArrayList<>();
        int t = input.nextInt();
        while (t-->0){
            int gio = input.nextInt(),phut = input.nextInt(),giay = input.nextInt();
            ds.add(new thoigian(gio,phut,giay));
        }
        Collections.sort(ds);
        for(thoigian i:ds){
            System.out.println(i);
        }
    }
}
