package DSMonthi;

public class DS implements Comparable<DS> {
    private String ma,mon,hinhthuc;

    public DS(String ma, String mon, String hinhthuc) {
        this.ma = ma;
        this.mon = mon;
        this.hinhthuc = hinhthuc;
    }

    @Override
    public String toString() {
        return ma+" "+mon+" "+hinhthuc;
    }

    @Override
    public int compareTo(DS o) {
        return ma.compareTo(o.ma);
    }
}
