package J04007;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        String hovaten = input.nextLine();
        String gioitinh = input.nextLine();
        String ngaysinh = input.nextLine();
        String diachi = input.nextLine();
        String masothue = input.nextLine();
        String ngaykyhopdong = input.nextLine();

        Nhanvien dat = new Nhanvien(1,hovaten,gioitinh,ngaysinh,diachi,ngaykyhopdong,masothue);

        System.out.println(dat);
    }
}
