package J05082;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Khachhang implements Comparable<Khachhang> {
    private String id,name,gioitinh;
    private Date ngaysinh;
    private String diachi;

    public Khachhang(int id, String name, String gioitinh, String ngaysinh, String diachi) throws ParseException {
        this.id ="KH"+String.format("%03d",id+1);
        this.name = name;
        this.gioitinh = gioitinh;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.diachi = diachi;
    }
    private String chuyenhoa(){
        String ma = name.toLowerCase().trim();
        String [] tu = ma.split("\\s+");
        StringBuilder ds = new StringBuilder();
        for(String i:tu){
            ds.append(Character.toUpperCase(i.charAt(0))).append(i.substring(1)).append(" ");
        }
        return ds.toString().trim();
    }

    @Override
    public String toString() {
        return id+" "+chuyenhoa()+" "+gioitinh+" "+diachi+" "+new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh);
    }

    @Override
    public int compareTo(Khachhang o) {
        if(o.ngaysinh.before(this.ngaysinh)) return 1;
        else if(o.ngaysinh.equals(this.ngaysinh)) return 0;
        else return -1;
    }
}
