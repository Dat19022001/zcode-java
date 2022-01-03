package J04014;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-->0){
            long a1 = input.nextLong(),y1 = input.nextLong(),a2 = input.nextLong(),y2 = input.nextLong();
            tongphanso a = new tongphanso(a1,y1);
            tongphanso b = new tongphanso(a2,y2);
            tongphanso c = a.tong(b);
            tongphanso d = c.getC();
            tongphanso e = d.getD(a,b);
            System.out.print(d+" ");
            System.out.println(e);

        }

    }

}
