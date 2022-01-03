package J04006;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        String hovaten = input.nextLine();
        String lop = input.nextLine();
        String ngaysinh = input.nextLine();
        Float gpa = Float.parseFloat(input.nextLine());
        Lopsinhvien dat = new Lopsinhvien( hovaten,1,lop,ngaysinh,gpa);

        System.out.println(dat);
    }
}
