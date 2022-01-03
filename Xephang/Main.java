package Xephang;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("MATHANG.in"));
        ArrayList<sapxep> ds = new ArrayList<>();
        int t = Integer.parseInt(input.nextLine());
        for(int i=0;i<t;i++){
            String name = input.nextLine();
            String nhomhang= input.nextLine();
            float mua = Float.parseFloat(input.nextLine());
            float ban = Float.parseFloat(input.nextLine());
            ds.add(new sapxep(i,name,nhomhang,mua,ban));
        }
//        int n = Integer.parseInt(input.nextLine());
//        Collections.sort(ds);
//        int a = ds.get(n-1).get;
//        for (sapxep i:ds){
//            if(i.ge>=a)
//            System.out.println(i+" "+tr);
//        }
    }
}
