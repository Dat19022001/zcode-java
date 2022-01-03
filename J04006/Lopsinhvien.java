package J04006;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Lopsinhvien {
    private String hovaten,maSv,lop;
    private Date ngaysinh;
    private Float gpa;

    public Lopsinhvien(String hovaten, int maSv, String lop, String ngaysinh, Float gpa) throws ParseException {
        this.hovaten = hovaten;
        this.maSv = "B20DCCN"+ String.format("%03d",maSv);
        this.lop = lop;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return maSv+" "+hovaten+" "+lop+" "+new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh)+" "+String.format("%.2f",gpa);
    }
}
