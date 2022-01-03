package DSCathi;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DSCA implements Comparable<DSCA> {
    private String ma;
    private Date ngay,gio;
    private String phong;

    public DSCA(int ma, String ngay, String gio, String phong) throws ParseException {
        this.ma ="C"+String.format("%03d",ma+1);
        this.ngay = new SimpleDateFormat("dd/MM/yyyy").parse(ngay);
        this.gio = new SimpleDateFormat("hh:mm").parse(gio);
        this.phong = phong;
    }

    @Override
    public String toString() {
        return ma+" "+new SimpleDateFormat("dd/MM/yyyy").format(ngay)+" "+new SimpleDateFormat("HH:mm").format(gio)+" "+phong;
    }

    @Override
    public int compareTo(DSCA o) {
        if(o.ngay.before(ngay))
            return 1;
        else if (o.ngay.after(ngay))
            return -1;
        else
            if(o.gio.before(gio))
                return 1;
            else if(o.gio.after(gio))
                return -1;
            else
                return ma.compareTo(o.ma);
    }
}
