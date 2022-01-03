package J05067;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<giaxang> ds = new ArrayList<>();
        int n = Integer.parseInt(input.nextLine());
        for(int i =0;i<n;i++){
            ds.add(new giaxang(input.next(), Integer.parseInt(input.next())));
            input.nextLine();
        }
        Collections.sort(ds);
        for(giaxang i:ds){
            System.out.println(i);
        }
    }
}
