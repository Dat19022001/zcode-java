package J07049;

public class NM {
    private int id;
    private String tenKH,diachi,maSP;
    private int sl;
    private String ngaymua;

    public NM(int id, String tenKH, String diachi, String maSP, int sl, String ngaymua) {
        this.id = id;
        this.tenKH = tenKH;
        this.diachi = diachi;
        this.maSP = maSP;
        this.sl = sl;
        this.ngaymua = ngaymua;
    }

    public int getId() {
        return id;
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getMaSP() {
        return maSP;
    }

    public int getSl() {
        return sl;
    }

    public String getNgaymua() {
        return ngaymua;
    }

    @Override
    public String toString() {
        return "NM{" +
                "id=" + id +
                ", tenKH='" + tenKH + '\'' +
                ", diachi='" + diachi + '\'' +
                ", maSP='" + maSP + '\'' +
                ", sl=" + sl +
                ", ngaymua='" + ngaymua + '\'' +
                '}';
    }
}
