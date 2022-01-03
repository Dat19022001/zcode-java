package SX;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SV implements Comparable<SV> {
    private String maSV,maM,maSo,soSV,tenM,ht;
    private Date ngay,gio;
    private String phong;

    public SV(String maSV, String maM, String maSo, String soSV, String tenM, String ht, String ngay, String gio, String phong) throws ParseException {
        this.maSV = maSV;
        this.maM = maM;
        this.maSo = maSo;
        this.soSV = soSV;
        this.tenM = tenM;
        this.ht = ht;
        this.ngay = new SimpleDateFormat("dd/MM/yyyy").parse(ngay);
        this.gio =new SimpleDateFormat("HH:mm").parse(gio) ;
        this.phong = phong;
    }

    @Override
    public String toString() {
        return new SimpleDateFormat("dd/MM/yyyy").format(ngay)+" "+new SimpleDateFormat("HH:mm").format(gio)+" "+phong+" "+tenM+" "+maSo+" "+soSV;
    }


    @Override
    public int compareTo(SV o) {
        if(o.ngay.before(ngay))
            return 1;
        else if(o.ngay.equals(ngay)){
            if(o.gio.before(gio))
                return 1;
            else if(o.gio.equals(gio))
                return maSV.compareTo(o.maSV);
            else
                return -1;
        }
        else return -1;
    }
}
