package J04003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long tuso = input.nextLong(),mauso = input.nextLong();
        

        phanso ps = new phanso(tuso,mauso);

        ps.rutgon();
        System.out.println(ps);
    }
}
