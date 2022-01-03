package J07035;

public class Monhoc  {
    private String ma,mon;
    private int tinchi;

    public Monhoc(String ma, String mon, int tinchi) {
        this.ma = ma;
        this.mon = mon;
        this.tinchi = tinchi;
    }

    public String getMa() {
        return ma;
    }

    public String getMon() {
        return mon;
    }

    public int getTinchi() {
        return tinchi;
    }

    @Override
    public String toString() {
        return ma+" "+mon+" "+tinchi;
    }
}
