package J05069;

public class sosanh implements Comparable<sosanh> {
    private String id,name;
    private int doanhthu;

    public sosanh(String id, String name, int doanhthu) {
        this.id = id;
        this.name = name;
        this.doanhthu = doanhthu;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+doanhthu;
    }

    @Override
    public int compareTo(sosanh o) {
        if(o.doanhthu == this.doanhthu)
            return this.name.compareTo(o.name);
        return o.doanhthu-this.doanhthu;
    }
}
