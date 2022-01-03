package J05029;


public class dsThuctap implements Comparable<dsThuctap> {
    private String ma,name;
    private int soluong;

    public dsThuctap(String ma, String name, int soluong) {
        this.ma = ma;
        this.name = name;
        this.soluong = soluong;
    }

    public int getSoluong() {
        return soluong;
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+soluong;
    }


    @Override
    public int compareTo(dsThuctap o) {
        if(o.soluong == this.soluong)
            return this.ma.compareTo(o.ma);
        return o.soluong-this.soluong;
    }
}
