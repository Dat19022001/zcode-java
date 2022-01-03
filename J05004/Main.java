package J05004;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        Sinhvien [] sinhviens = new Sinhvien[t];
        for (int i = 0;i<t;i++){
            String hovate = input.nextLine();
            String lop = input.nextLine();
            String ngaysinh = input.nextLine();
            float gpa = Float.parseFloat(input.nextLine());
            sinhviens[i] = new Sinhvien(i+1,hovate,lop,ngaysinh,gpa);
        }
        Arrays.sort(sinhviens);
        for(int i = 0;i<t;i++){
            System.out.println(sinhviens[i]);
        }
    }
}
