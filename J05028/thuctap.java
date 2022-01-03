package J05028;

public class thuctap implements Comparable<thuctap> {
    private String ma,name;
    private int soluong;

    public thuctap(String ma, String name, int soluong) {
        this.ma = ma;
        this.name = name;
        this.soluong = soluong;
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+soluong;
    }

    @Override
    public int compareTo(thuctap o) {
        if(o.soluong == this.soluong)
            return this.ma.compareTo(o.ma);
        return o.soluong-this.soluong;
    }
}
