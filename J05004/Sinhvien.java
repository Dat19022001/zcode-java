package J05004;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sinhvien implements Comparable<Sinhvien> {
    private String maSV;
    private String hovaten,lop;
    private Date ngaysinh;
    private float gpa;

    public Sinhvien() {
        this.maSV="";
        this.hovaten="";
        this.lop="";
        this.gpa = 0;
    }

    public Sinhvien(int maSV, String hovaten, String lop, String ngaysinh, float gpa) throws ParseException {
        this.maSV = "B20DCCN"+String.format("%03d",maSV);
        this.hovaten = hovaten;
        this.lop = lop;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.gpa = gpa;
    }
    private String chuyenhoa(){
        String ma1 = hovaten.toLowerCase().trim();
        String [] tu = ma1.split("\\s+");
        StringBuilder d = new StringBuilder();
        for(String i:tu){
            d.append(Character.toUpperCase(i.charAt(0))).append(i.substring(1)).append(" ");
        }
        return d.toString().trim();
    }

    @Override
    public String toString() {
        return maSV+" "+chuyenhoa()+" "+lop+" "+new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh)+" "+String.format("%.2f",gpa);
    }

    @Override
    public int compareTo(Sinhvien o) {
        return o.gpa > this.gpa ? 1:-1;
    }
}
