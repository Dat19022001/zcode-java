package J04008;


public class Poin1 {
    private double x1,y1;

    public Poin1() {
    }

    public Poin1(double x1, double y1) {
        this.x1 = x1;
        this.y1 = y1;
    }
    public Poin1(Poin1 p){
        this.x1=p.x1;
        this.y1=p.y1;
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }
    public double Distance(Poin1 p){
        return Math.sqrt((p.getX1()-this.x1)*(p.getX1()-this.x1)+(p.getY1()-this.y1)*(p.getY1()-this.y1));
    }
     public static double Distance(Poin1 p1, Poin1 p2){
        return (double) Math.round(p1.Distance(p2)*10000)/10000;
    }
}
