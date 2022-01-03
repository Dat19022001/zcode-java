package J07047;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class gia implements Comparable<gia> {
    private String id,name,maP;
    private Date ngayden,ngaydi;
    private float dongia,phiphucvu;

    public gia(int id, String name, String maP, String ngayden, String ngaydi, float dongia, float phiphucvu) throws ParseException {
        this.id ="KH"+String.format("%02d",id+1);
        this.name = name;
        this.maP = maP;
        this.ngayden = new SimpleDateFormat("dd/MM/yyyy").parse(ngayden);
        this.ngaydi = new SimpleDateFormat("dd/MM/yyyy").parse(ngaydi);
        this.dongia = dongia;
        this.phiphucvu = phiphucvu;
    }
    private int ngayo(){
        long a = ngaydi.getTime()- ngayden.getTime();
        TimeUnit t = TimeUnit.DAYS;
        if(t.convert(a,TimeUnit.MILLISECONDS)==0){
            return 1;
        }
        return (int) t.convert(a,TimeUnit.MILLISECONDS);
    }
    private double tienphong(){
        return ngayo()*dongia;
    }
    private double PV(){
        return tienphong()*phiphucvu;
    }
    private double tiengiam(){
        if(ngayo()>=30){
            return 0.06;
        }
        else if(ngayo()>=20){
            return 0.04;
        }
        else if(ngayo()>=10){
            return 0.02;
        }
        else
            return 0;
    }
    private double tientra(){
        double tong = (tienphong()+PV())*(1-tiengiam());
        return (double) Math.round(tong*100)/100;
    }

    @Override
    public String toString() {
        if(ngayo() == 1){
            return id+" "+name+" "+maP+" "+0+" "+String.format("%.02f",tientra());
        }
        return id+" "+name+" "+maP+" "+ngayo()+" "+String.format("%.02f",tientra());
    }

    @Override
    public int compareTo(gia o) {
        return o.ngayo()-ngayo();
    }
}
