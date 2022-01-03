package J04012;

public class luong {
    private String hovaten,chucvu,maNV;
    private int lcb,ngaycong;

    public luong(String hovaten, String chucvu, int maNV, int lcb, int ngaycong) {
        this.hovaten = hovaten;
        this.chucvu = chucvu;
        this.maNV = "NV" + String.format("%02d",maNV);
        this.lcb = lcb;
        this.ngaycong = ngaycong;
    }

    private long tien(){
        long c = lcb*ngaycong;
        return c;
    }
    public long phucap() {
        if (chucvu.equals("GD")) {
            return 250000;
        }
        else if (chucvu.equals("PGD")) {
            return 200000;
        }
        else if (chucvu.equals("TP")) {
            return 180000;
        }
        else
            return 150000;
    }
    public long thuong(){
        if (ngaycong > 25){
            return  (long)(tien()/5);
        }
        if(ngaycong >= 22){
            return (long)(tien()/10);
        }
        return 0;
    }
    public long tong(){
        long c = tien()+thuong()+phucap();
        return c;
    }

    @Override
    public String toString() {
        return maNV+" "+hovaten+" "+tien()+" "+thuong()+" "+phucap()+" "+tong();
    }
}
