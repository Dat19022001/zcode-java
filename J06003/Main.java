package J06003;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<DSSV> ds1 = new ArrayList<>();
        Map<Integer,String> btl = new TreeMap<>();
        int t = input.nextInt(),a= input.nextInt();
        input.nextLine();
        for (int i= 0;i<t;i++){
            ds1.add(new DSSV(input.nextLine(), input.nextLine(), input.nextLine(), Integer.parseInt(input.nextLine())));
        }
        for(int i=1;i<=a;i++){
            btl.put(i, input.nextLine());
        }
        int k = Integer.parseInt(input.nextLine());
        for(int i=0;i<k;i++){
            int h = Integer.parseInt(input.nextLine());
            System.out.println("DANH SACH NHOM "+h+":");
            for(DSSV j:ds1){
                if(j.getNhom()==h){
                    System.out.println(j);
                }
            }
            System.out.println("Bai tap dang ky: "+btl.get(h));
        }
    }
}
