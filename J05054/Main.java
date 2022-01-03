package J05054;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<thuhang> ds = new ArrayList<>();
        int n = Integer.parseInt(input.nextLine());
        for(int i = 0;i<n;i++){
            ds.add(new thuhang(i, input.nextLine(),Float.parseFloat(input.nextLine())));
        }
        for(thuhang i:ds){
            int count = stt(ds,i);
            System.out.println(i+" "+count);
        }
    }
    static int stt(ArrayList<thuhang> ds,thuhang a){
        int count = 1;
        for(thuhang i:ds){
            if(!i.equals(a)){
                if(a.getTb() < i.getTb()){
                    count ++;
                }
            }
        }
        return count;
    }
}
