package J05006;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        Nhanvien1 [] ds = new Nhanvien1[t];
        for(int i= 0;i<t;i++){
            String name = input.nextLine();
            String gioitinh = input.nextLine();
            String ngaysinh = input.nextLine();
            String diachi = input.nextLine();
            String masothue = input.nextLine();
            String ngaykyhopdong = input.nextLine();
            ds [i] = new Nhanvien1(i,name,gioitinh,ngaysinh,diachi,masothue,ngaykyhopdong);
        }
        Arrays.sort(ds);
        for(Nhanvien1 i:ds){
            System.out.println(i);
        }
    }
}
