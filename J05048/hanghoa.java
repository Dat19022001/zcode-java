package J05048;

public class hanghoa implements Comparable<hanghoa> {
    private String ma;
    private int soluong;

    public hanghoa(String ma, int soluong) {
        this.ma = ma;
        this.soluong = soluong;
    }

    public String getMa() {
        return String.valueOf(ma.charAt(0));
    }

    private int xuat(){
        if(ma.charAt(0) == 'A')
            return (int) Math.round(0.6*soluong);
        else
            return (int) Math.round(0.7*soluong);
    }
    private int dongia(){

        if(ma.charAt(ma.length()-1) == 'Y')
            return 110000;
        else
            return 135000;
    }
    private int tien(){
        return dongia()*xuat();
    }
    private int thue(){
        String ma1=ma.substring(0,1),ma2=ma.substring(ma.length()-1);
        if(ma1.equals("A")&&ma2.equals("Y"))
            return (int) (0.08*tien());
        if(ma1.equals("A")&&ma2.equals("N"))
            return (int) (0.11*tien());
        if(ma1.equals("B")&&ma2.equals("Y"))
            return (int) (0.17*tien());
        return (int) (0.22*tien());
    }

    @Override
    public String toString() {
        return ma+" "+soluong+" "+xuat()+" "+dongia()+" "+tien()+" "+thue();
    }

    @Override
    public int compareTo(hanghoa o) {
        return o.thue()-this.thue();
    }
}
