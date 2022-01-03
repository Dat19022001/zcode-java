package J07050;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input =new Scanner(new File("MATHANG.in"));
        ArrayList<mathang> ds = new ArrayList<>();
        int t = Integer.parseInt(input.nextLine());
        for(int i = 0;i<t;i++){
            String name = input.nextLine();
            String mahang = input.nextLine();
            float mua = Float.parseFloat(input.nextLine());
            float ban = Float.parseFloat(input.nextLine());
            ds.add(new mathang(i,name,mahang,mua,ban));
        }
        Collections.sort(ds);
        for(mathang i:ds){
            System.out.println(i);
        }
    }
}
