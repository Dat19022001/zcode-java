package J05030;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Bangdiem> ds = new ArrayList<>();
        for(int i=0;i<n;i++){
            ds.add(new Bangdiem(input.nextLine(),input.nextLine(),input.nextLine(),Float.parseFloat(input.nextLine()),Float.parseFloat(input.nextLine()),Float.parseFloat(input.nextLine())));
        }
        Collections.sort(ds);
        int count =1;
        for(Bangdiem i:ds){
            System.out.print(count+" ");
            System.out.println(i);
            count +=1;
        }
    }
}
