package J06004;

public class in implements Comparable<in> {
    private String maSv,name,sdt;
    private int nhom;
    private String tenBT;

    public in(String maSv, String name, String sdt, int nhom, String tenBT) {
        this.maSv = maSv;
        this.name = name;
        this.sdt = sdt;
        this.nhom = nhom;
        this.tenBT = tenBT;
    }

    @Override
    public String toString() {
        return maSv+" "+name+" "+sdt+" "+nhom+" "+tenBT;
    }

    @Override
    public int compareTo(in o) {
        return maSv.compareTo(o.maSv);
    }
}
