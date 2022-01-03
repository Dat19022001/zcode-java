package J05055;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class thanhtich {
    private String id,name;
    private Date ngaysinh,start,end;

    public thanhtich(int id, String name, String ngaysinh, String start, String end) throws ParseException {
        this.id ="VDV"+String.format("%02d",id+1);
        this.name = name;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.start = new SimpleDateFormat("hh:mm:ss").parse(start);
        this.end = new SimpleDateFormat("hh:mm:ss").parse(end);
    }
    public String thanh(){
        long a = (end.getTime()-start.getTime())/1000;

        int gio = (int)(a/3600);
        int phut =(int)(a/60);
        int giay =(int) (a%60);
        return String.format("%02d", gio) + ":" + String.format("%02d", phut) + ":" + String.format("%02d", giay);
    }
    public String uuTien() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date today = new Date();
        int tuoi = today.getYear() - ngaysinh.getYear();
        if(tuoi < 18)
            return "00:00:00";
        if(tuoi < 25)
            return "00:00:01";
        if(tuoi < 32)
            return "00:00:02";
        return "00:00:03";
    }
    public String ketQua() {
        String kq = thanh();
        long res = Integer.parseInt(kq.substring(0,2)) * 3600 + Integer.parseInt(kq.substring(3,5)) * 60
                + Integer.parseInt(kq.substring(6)) - Integer.parseInt(uuTien().substring(6)) ;
        int gio = (int) (res/3600);
        int phut = (int) (res/60);
        int giay = (int) (res%60);
        return String.format("%02d", gio) + ":" + String.format("%02d", phut) + ":" + String.format("%02d", giay);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
