package J05014;

public class TuyenGV implements Comparable<TuyenGV> {
    private String ma,ten,mon;
    private double mon1,mon2;

    public TuyenGV(int ma, String ten, String mon, double mon1, double mon2) {
        this.ma ="GV"+String.format("%02d",ma+1);
        this.ten = ten;
        this.mon = mon;
        this.mon1 = mon1;
        this.mon2 = mon2;
    }
    private String day(){
        if(mon.charAt(0) == 'A')
            return "TOAN";
        if(mon.charAt(0)=='B')
            return "LY";
        return "HOA";
    }
    public double tong() {
        double diem = mon1*2 + mon2;
        if(mon.charAt(1) == '1')
            return diem + 2;
        if(mon.charAt(1) == '2')
            return diem + 1.5;
        if(mon.charAt(1) == '3')
            return diem + 1;
        return diem;
    }

    public String ketQua() {
        if(tong() >= 18)
            return "TRUNG TUYEN";
        return "LOAI";
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+day()+" "+tong()+" "+ketQua();
    }

    @Override
    public int compareTo(TuyenGV o) {
        if(o.tong()==this.tong()){
            return ma.compareTo(o.ma);
        }
        return o.tong() > this.tong() ? 1:-1;
    }
}
