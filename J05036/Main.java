package J05036;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<giaca> ds = new ArrayList<>();
        int n = Integer.parseInt(input.nextLine());
        for(int i=0;i<n;i++){
            ds.add(new giaca(i, input.nextLine(), input.nextLine(), Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine())));
        }
        Collections.sort(ds);
        for(giaca i:ds){
            System.out.println(i);
        }
    }
}
