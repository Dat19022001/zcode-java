package J07018;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class sv {
    private String id,name,lop;
    private Date ngaysinh;
    float gpa;

    public sv(int id, String name, String lop, String ngaysinh, float gpa) throws ParseException {
        this.id ="B20DCCN"+String.format("%03d",id+1) ;
        this.name = name;
        this.lop = lop;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.gpa = gpa;
    }
    private String chuyenhoa(){
        String a = this.name.toLowerCase().trim();
        String [] tu = a.split("\\s+");
        StringBuilder ds = new StringBuilder();
        for(String i:tu){
            ds.append(Character.toUpperCase(i.charAt(0))).append(i.substring(1)).append(" ");
        }
        return ds.toString().trim();
    }

    @Override
    public String toString() {
        return id+" "+chuyenhoa()+" "+lop+" "+new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh)+" "+String.format("%.2f",gpa);
    }
}
