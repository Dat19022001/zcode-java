package J04019;


public class Triangle {
    private Point p1,p2,p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public boolean valid(){
        double d1 = p1.Distance(p2);
        double d2 = p1.Distance(p3);
        double d3 = p2.Distance(p3);
        if((d1+d2)<=d3 || (d1+d3)<=d2 || (d2+d3)<=d1){
            return false;
        }
        return true;
    }
    public String getPerimeter(){
        double d1 = p1.Distance(p2);
        double d2 = p1.Distance(p3);
        double d3 = p2.Distance(p3);
        double chuvi = (double) Math.round((d1+d2+d3)*1000)/1000;
        return String.format("%.3f",chuvi);
    }

}
