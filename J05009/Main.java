package J05009;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        ArrayList<thukhoa> ds = new ArrayList<>();
        int n = Integer.parseInt(input.nextLine());
        float max = 0;
        for(int i = 0;i<n;i++){
            thukhoa a = new thukhoa(i, input.nextLine(), input.nextLine(), Float.parseFloat(input.nextLine()),Float.parseFloat(input.nextLine()),Float.parseFloat(input.nextLine()));
            if(a.tong()>max){
                max = a.tong();
            }
            ds.add(a);
        }
        for(thukhoa i:ds){
            if(i.tong() == max){
                System.out.println(i);
            }
        }
    }
}
