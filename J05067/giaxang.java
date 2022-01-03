package J05067;

public class giaxang implements Comparable<giaxang> {
    private String ma;
    public int sl;

    public giaxang(String ma, int sl) {
        this.ma = ma;
        this.sl = sl;
    }
    private String hangsanxuat(){
        String kh = ma.substring(3);
        if(kh.equals("BP"))
            return "British Petro";
        if(kh.equals("ES"))
            return "Esso";
        if(kh.equals("SH"))
            return "Shell";
        if(kh.equals("CA"))
            return "Castrol";
        if(kh.equals("MO"))
            return "Mobil";
        return "Trong Nuoc";
    }
    private int DonGia(){
        char c = ma.charAt(0);
        if(c == 'X')
            return 128000;
        if(c == 'D')
            return 11200;
        return 9700;
    }
    private long thue(){
        if (ma.substring(3).equals("TN"))
            return 0;
        char c = ma.charAt(0);
        long tong = (long) sl * DonGia();
        if(c == 'X')
            return (int) (0.03*tong);
        if(c == 'D')
            return (int) (0.035*tong);
        return (int) (0.02*tong);
    }
    private long Tien() {
        return (long) DonGia() * sl + thue();
    }

    @Override
    public String toString() {
        return ma+" "+hangsanxuat()+" "+DonGia()+" "+thue()+" "+Tien();
    }

    @Override
    public int compareTo(giaxang o) {
        return o.Tien()>this.Tien()? 1:-1;
    }
}
