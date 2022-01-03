package J04012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String hovaten = input.nextLine();
        int lcb = Integer.parseInt(input.nextLine());
        int ngaycong = Integer.parseInt(input.nextLine());
        String chucvu = input.nextLine();
        luong s = new luong(hovaten,chucvu,1,lcb,ngaycong);

        System.out.println(s);
    }
}
