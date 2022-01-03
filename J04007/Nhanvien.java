package J04007;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Nhanvien {
    private String maNV,hovaten,gioitinh,diachi,masothue;
    private Date ngaysinh,ngaykyhopdong;

    public Nhanvien(int maNV, String hovaten, String gioitinh, String ngaysinh, String diachi, String ngaykyhopdong, String masothue) throws ParseException {
        this.maNV = String.format("%05d",maNV);
        this.hovaten = hovaten;
        this.gioitinh = gioitinh;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.diachi = diachi;
        this.ngaykyhopdong = new SimpleDateFormat("dd/MM/yyyy").parse(ngaykyhopdong);
        this.masothue = masothue;
    }

    @Override
    public String toString() {
        return maNV+" "+hovaten+" "+gioitinh+" "+new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh)+" "+diachi+" "+masothue+" "+new SimpleDateFormat("dd/MM/yyyy").format(ngaykyhopdong);
    }
}
