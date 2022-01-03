package J05030;

public class Bangdiem implements Comparable<Bangdiem> {
    private String ma,name,lop;
    private float mon1,mon2,mon3;

    public Bangdiem(String ma, String name, String lop, float mon1, float mon2, float mon3) {
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+lop+" "+String.format("%.1f",mon1)+" "+String.format("%.1f",mon2)+" "+String.format("%.1f",mon3);
    }

    @Override
    public int compareTo(Bangdiem o) {
        return this.name.compareTo(o.name);
    }
}
