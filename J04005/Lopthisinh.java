package J04005;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Lopthisinh {
    private String hovaten;
    private Date ngaysinh;
    private Float mon1,mon2,mon3;

    public Lopthisinh(String hovaten, String ngaysinh, Float mon1, Float mon2, Float mon3) throws ParseException {
        this.hovaten = hovaten;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }

    @Override
    public String toString() {
        return hovaten+" "+new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh)+" "+String.format("%.1f",mon1+mon2+mon3);
    }
}
