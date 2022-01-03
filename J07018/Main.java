package J07018;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner input = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(input.nextLine());
        for (int i = 0;i<t;i++){
            String name = input.nextLine();
            String lop = input.nextLine();
            String ngaysinh = input.nextLine();
            float gpa = Float.parseFloat(input.nextLine());
            sv a = new sv(i,name,lop,ngaysinh,gpa);
            System.out.println(a);
        }
    }
}
