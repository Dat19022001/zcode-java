package J04013;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ketqua s = new ketqua(input.nextLine(), input.nextLine(),Double.parseDouble(input.nextLine()),Double.parseDouble(input.nextLine()),Double.parseDouble(input.nextLine()));

        System.out.println(s);

    }
}
