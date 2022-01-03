package J04008;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-->0){
            Double x1 = input.nextDouble(),y1 = input.nextDouble(),x2 = input.nextDouble(),y2 = input.nextDouble(),x3 = input.nextDouble(),y3 = input.nextDouble();
            Poin1 p1 = new Poin1(x1,y1);
            Poin1 p2 = new Poin1(x2,y2);
            Poin1 p3 = new Poin1(x3,y3);
            double d1 = p1.Distance(p2),d2=p1.Distance(p3),d3= p2.Distance(p3);

            if((d1+d2)<=d3 || (d1+d3)<=d2 || (d2+d3)<=d1){
                System.out.println("INVALID");
            }
            else {
                double kq = 0.25*Math.sqrt((d1+d2+d3)*(d1+d2-d3)*(d1-d2+d3)*(-d1+d2+d3));
                double R = (d1*d2*d3)/(4*kq);
                double s = (double) Math.round(Math.PI*Math.pow(R,2)*1000) / 1000;
                System.out.printf("%.3f",s);
                System.out.println();
            }
        }
    }
}
