package J05042;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<stt> ds = new ArrayList<>();
        int n = Integer.parseInt(input.nextLine());
        for(int i = 0;i<n;i++){
            ds.add(new stt(input.nextLine(),Integer.parseInt(input.next()),Integer.parseInt(input.next())));
            input.nextLine();
        }
        Collections.sort(ds);
        for(stt i:ds){
            System.out.println(i);
        }
    }
}
