package J05079;

public class Sinhvien implements Comparable<Sinhvien> {
    private String ma,ten,nhom,tenGV;

    public Sinhvien(String ma, String ten, String nhom, String tenGV) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.tenGV = tenGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+nhom;
    }

    @Override
    public int compareTo(Sinhvien o) {
        if(o.ma.equals(ma)){
            return nhom.compareTo(o.nhom);
        }
        return ma.compareTo(o.ma);
    }
}
