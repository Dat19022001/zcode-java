package J05069;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<CLB> ds = new ArrayList<>();
        ArrayList<sosanh> ds1=new ArrayList<>();
        int n = Integer.parseInt(input.nextLine());
        for(int i =0;i< n;i++){
            ds.add(new CLB(input.nextLine(), input.nextLine(), Integer.parseInt(input.nextLine())));
        }
        int t = Integer.parseInt(input.nextLine());
        for(int i =0;i<t;i++){
            String a= input.next();
            int giave = Integer.parseInt(input.next());
            input.nextLine();
            for( CLB j:ds){
                if(j.getMa().equals(a.substring(1,3))){
                    ds1.add(new sosanh(a,j.getTen(),j.getSl()*giave));
                    break;
                }
            }
        }
        Collections.sort(ds1);
        for(sosanh i:ds1){
            System.out.println(i);
        }
    }
}
