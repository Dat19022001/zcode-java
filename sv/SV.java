package sv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SV {
    private String msv,name,lop;
    private Date ngaysinh;
    private Float gpa;

    public SV(int msv, String name, String lop, String ngaysinh, Float gpa) throws ParseException {
        this.msv = "B20DCCN" + String.format("%03d",msv);
        this.name = name;
        this.lop = lop;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return msv +" "+ name +" "+lop+" "+ new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh)+" "+String.format("%.2f",gpa);
    }
}
