package J07028;

public class RA {
    private String ma,tenGV,maMH,tenMH;
    private float gio;

    public RA(String ma, String tenGV, String maMH, String tenMH, float gio) {
        this.ma = ma;
        this.tenGV = tenGV;
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.gio = gio;
    }

    public String getTenGV() {
        return tenGV;
    }

    public float getGio() {
        return gio;
    }

    @Override
    public String toString() {
        return tenGV+" "+String.format("%.2f",gio);
    }
}
