package J04015;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        luong s = new luong(input.nextLine(),input.nextLine(),Integer.parseInt(input.nextLine()));
        System.out.println(s);
    }
}
