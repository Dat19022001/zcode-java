package J07049;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IN implements Comparable<IN> {
    private String id,tenKH,diachi;
    private int sl;
    private Date ngaymua;
    private String maSP,ten;
    private int gia,thoihan;

    public IN(int id, String tenKH, String diachi, int sl, String ngaymua, String maSP, String ten, int gia, int thoihan) throws ParseException {
        this.id ="KH"+String.format("%02d",id+1);
        this.tenKH = tenKH;
        this.diachi = diachi;
        this.sl = sl;
        this.ngaymua = new SimpleDateFormat("dd/MM/yyyy").parse(ngaymua);
        this.maSP = maSP;
        this.ten = ten;
        this.gia = gia;
        this.thoihan = thoihan;
    }
    private long tra(){
        return sl*gia;
    }
    private Date han() throws ParseException {
        String ngay = new SimpleDateFormat("dd/MM/yyyy").format(ngaymua);
        int thang = Integer.parseInt(ngay.substring(3,5))+thoihan;
        int nam = Integer.parseInt(ngay.substring(6)) + (thang/12);
        String t = ngay.substring(0,2)+"/"+(thang%12)+"/"+nam;
        return new SimpleDateFormat("dd/MM/yyyy").parse(t);
    }

    @Override
    public String toString() {
        try {
            return id+" "+tenKH+" "+diachi+" "+maSP+" "+tra()+" "+new SimpleDateFormat("dd/MM/yyyy").format(han());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }

    @Override
    public int compareTo(IN o) {
        try {
            if(o.han().equals(han())){
                return id.compareTo(o.id);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            return han().compareTo(o.han());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
