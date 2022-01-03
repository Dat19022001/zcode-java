package J07047;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Nguoi {
    private int id;
    private String name,maP;
    private String ngayden,ngaydi;

    public Nguoi(int id, String name, String maP, String ngayden, String ngaydi) {
        this.id = id;
        this.name = name;
        this.maP = maP;
        this.ngayden = ngayden;
        this.ngaydi = ngaydi;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMaP() {
        return maP;
    }
    public String getNgayden() {
        return ngayden;
    }

    public String getNgaydi() {
        return ngaydi;
    }

}
