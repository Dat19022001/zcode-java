package J05006;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Nhanvien1 implements Comparable<Nhanvien1> {
    private String id;
    private String name,gioitinh;
    private Date ngaysinh;
    private String diachi,masothue;
    private Date ngaykyhopdong;

    public Nhanvien1(int id, String name, String gioitinh, String ngaysinh, String diachi, String masothue, String ngaykyhopdong) throws ParseException {
        this.id = String.format("%05d",id+1);
        this.name = name;
        this.gioitinh = gioitinh;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.diachi = diachi;
        this.masothue = masothue;
        this.ngaykyhopdong = new SimpleDateFormat("dd/MM/yyyy").parse(ngaykyhopdong);
    }

    @Override
    public String toString() {
        return id+" "+name+" "+gioitinh+" "+new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh)+" "+diachi+" "+masothue+" "+new SimpleDateFormat("dd/MM/yyy").format(ngaykyhopdong);
    }

    @Override
    public int compareTo(Nhanvien1 o) {
        if(o.ngaysinh.before(this.ngaysinh)) return 1;
        else if(o.ngaysinh.equals(this.ngaysinh)) return 0;
        else return -1;
    }
}
