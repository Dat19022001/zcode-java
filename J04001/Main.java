package J04001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-->0){
            double x1 = input.nextDouble(),y1= input.nextDouble(),x2= input.nextDouble(),y2= input.nextDouble();
            Poin p1 = new Poin(x1,y1);
            Poin p2 = new Poin(x2,y2);
            layout x = new layout(p1,p2);
            System.out.println(x);
        }
    }
}
