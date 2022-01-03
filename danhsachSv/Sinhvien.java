package danhsachSv;

public class Sinhvien implements Comparable<Sinhvien> {
    private String ma,hoten,lop,email;

    public Sinhvien(String ma, String hoten, String lop, String email) {
        this.ma = ma;
        this.hoten = hoten;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public String toString() {
        return ma+" "+hoten+" "+lop+" "+email;
    }

    @Override
    public int compareTo(Sinhvien o) {
        return this.ma.compareTo(o.ma);
    }
}
