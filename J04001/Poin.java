package J04001;

public class Poin {
    private Double x,y;

    public Poin() {
    }

    public Poin(Double x, Double y) {
        this.x = x;
        this.y = y;
    }
    public Poin(Poin p){
        this.x=p.x;
        this.y=p.y;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }
    public double Distance(Poin p){
        double x = Math.sqrt((p.getX()-this.x)*(p.getX()-this.x)+(p.getY()-this.y)*(p.getY()-this.y));
        return x;
    }
    public static double Distance(Poin p1,Poin p2){
        return (double) Math.round(p1.Distance(p2)*10000)/10000;
    }
}
