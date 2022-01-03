package J04018;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        for(int i = 0;i<n;i++){
            int a1 = input.nextInt(),b1 = input.nextInt(),a2= input.nextInt(),b2= input.nextInt();
            sophuc a = new sophuc(a1,b1);
            sophuc b = new sophuc(a2,b2);
            sophuc c = a.tong(b);
            sophuc d = a.tich(c);
            sophuc e = c.tich(c);
            System.out.print(d+", ");
            System.out.println(e);
        }
    }
}
