package J05048;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<hanghoa> ds = new ArrayList<>();
        int n = Integer.parseInt(input.nextLine());
        for(int i = 0;i<n;i++){
            hanghoa a = new hanghoa(input.nextLine(), Integer.parseInt(input.nextLine()));
            ds.add(a);
        }
        Collections.sort(ds);
        String t = input.nextLine();
        for(hanghoa i:ds){
            if(i.getMa().equals(t)){
                System.out.println(i);
            }
        }
    }
}
