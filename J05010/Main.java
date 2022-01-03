package J05010;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<sapxepHH> ds = new ArrayList<>();
        int n = Integer.parseInt(input.nextLine());
        for(int i = 0;i<n;i++){
            sapxepHH a = new sapxepHH(i, input.nextLine(), input.nextLine(), Double.parseDouble(input.nextLine()),Double.parseDouble(input.nextLine()));
            ds.add(a);
        }
        Collections.sort(ds);
        for(sapxepHH i:ds){
            System.out.println(i);
        }
    }
}
