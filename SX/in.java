package SX;

import java.util.Date;

public class in {
    private String id;
    private String ngay,gio;
    private String phong;

    public in(int id, String ngay, String gio, String phong) {
        this.id ="C"+String.format("%03d",id);
        this.ngay = ngay;
        this.gio = gio;
        this.phong = phong;
    }

    public String getId() {
        return id;
    }

    public String getNgay() {
        return ngay;
    }

    public String getGio() {
        return gio;
    }

    public String getPhong() {
        return phong;
    }
}
