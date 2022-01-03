package J04005;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        String hovaten = input.nextLine();
        String ngaysinh = input.nextLine();
        float mon1 = Float.parseFloat(input.nextLine());
        float mon2 = Float.parseFloat(input.nextLine());
        float mon3 = Float.parseFloat(input.nextLine());

        Lopthisinh dat= new Lopthisinh(hovaten,ngaysinh,mon1,mon2,mon3);
        System.out.println(dat);
    }
}
