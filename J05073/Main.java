package J05073;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = Integer.parseInt(input.nextLine());
        ArrayList<Giaban> ds = new ArrayList<>();
        for(int i = 0;i<t;i++){
            ds.add(new Giaban(input.next(),Integer.parseInt(input.next()),Integer.parseInt(input.next())));
            input.nextLine();
        }
        for(Giaban i:ds){
            System.out.println(i);
        }
    }
}
