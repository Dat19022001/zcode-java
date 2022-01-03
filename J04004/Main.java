package J04004;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long tuso1 = input.nextLong(),mauso1 = input.nextLong(),tuso2 = input.nextLong(),mauso2 = input.nextLong();

        tongphanso ps1 = new tongphanso(tuso1,mauso1);
        tongphanso ps2 = new tongphanso(tuso2,mauso2);

        tongphanso ps3 = ps1.tong(ps2);
        ps3.rutgon();
        System.out.println(ps3);
    }
}
