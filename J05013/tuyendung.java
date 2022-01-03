package J05013;

public class tuyendung implements Comparable<tuyendung> {
    private String ma, ten;
    private double diem1, diem2;

    public tuyendung(int ma, String ten, double diem1, double diem2) {
        this.ma = "TS" + String.format("%02d", ma+1);
        this.ten = ten;
        if(diem1 > 10) diem1/=10;
        if(diem2 > 10) diem2/=10;
        this.diem1 = diem1;
        this.diem2 = diem2;
    }

    private double tb() {
        return (diem1+diem2)/2;
    }

    private String xepLoai() {
        if(tb() < 5)
            return "TRUOT";
        if(tb() < 8)
            return "CAN NHAC";
        if(tb() < 9.5)
            return "DAT";
        return "XUAT SAC";
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + String.format("%.2f", tb()) + " " + xepLoai();
    }

    @Override
    public int compareTo(tuyendung o) {
        if(o.tb() > tb())
            return 1;
        if(tb() > o.tb())
            return -1;
        return 0;
    }
}
