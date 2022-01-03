package J05073;

public class Giaban {
    private String ma;
    private int gia,sl;

    public Giaban(String ma, int gia, int sl) {
        this.ma = ma;
        this.gia = gia;
        this.sl = sl;
    }
    private int tien(){
        return gia*sl;
    }
    private float thue(){
        if(ma.charAt(0) == 'T')
            return (float) (tien()*0.29);
        if(ma.charAt(0)=='C')
            return (float) (tien()*0.1);
        if(ma.charAt(0)=='D')
            return (float) (tien()*0.08);
        return (float) (tien()*0.02);
    }
    private float vanchuyen(){
        if(ma.charAt(0) == 'T')
            return(float) (4/100.0 * tien());
        if(ma.charAt(0) == 'C')
            return(float) (3/100.0 *tien()) ;
        if(ma.charAt(0) == 'D')
            return(float) (2.5/100.0 * tien());
        return(float) (0.5/100.0 * tien());
    }
    private boolean giamgia(){
        return ma.charAt(3) == 'C';
    }
    private double tong(){
        double a = thue();
        if(giamgia()) a=a*0.95;
        double kq = ((tien()+a+vanchuyen())*1.2)/sl;
        return(double) Math.round(kq*100)/100;
    }

    @Override
    public String toString() {
        return ma+" "+String.format("%.2f",tong());
    }
}
