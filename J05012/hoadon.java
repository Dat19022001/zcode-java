package J05012;

public class hoadon implements Comparable<hoadon> {
    private String ma,name;
    private int sl;
    private long dongia,tienchietkhau;

    public hoadon(String ma, String name, int sl, long dongia, long tienchietkhau) {
        this.ma = ma;
        this.name = name;
        this.sl = sl;
        this.dongia = dongia;
        this.tienchietkhau = tienchietkhau;
    }
    private long tientra(){
        return sl*dongia-tienchietkhau;
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+sl+" "+dongia+" "+tienchietkhau+" "+tientra();
    }

    @Override
    public int compareTo(hoadon o) {
        return o.tientra()>this.tientra() ? 1:-1;
    }
}
