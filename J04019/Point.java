package J04019;


import java.util.Scanner;

public class Point {
    private double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public static Point nextPoint(Scanner sc){
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        Point t = new Point(a,b);
        return t;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double Distance(Point p){
        double x = Math.sqrt((p.getX()-this.x)*(p.getX()-this.x)+(p.getY()-this.y)*(p.getY()-this.y));
        return x;
    }
    public static double Distance(Point p1,Point p2){
        return (double) Math.round(p1.Distance(p2)*10000)/10000;
    }

    @Override
    public String toString() {
        return x+" "+y;
    }
}
