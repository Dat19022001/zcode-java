package Xettuyen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class tinh implements Comparable<tinh> {
    private String id,name;
    private Date ngaysinh;
    private float mon1,mon2;

    public tinh(int id, String name, String ngaysinh, float mon1, float mon2) throws ParseException {
        this.id = "PH"+String.format("%02d",id+1);
        this.name = name;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.mon1 = mon1;
        this.mon2 = mon2;
    }
    private int trungbinh(){
        float t =  (mon1+mon2)/2;
        if(mon1 >=8 && mon2 >=8){
            t+=1;
        }
        else if (mon1 >=7.5 && mon2 >=7.5){
            t+=0.5;
        }
        t = Math.round(t);
        if(t>10){
            t =10;
        }
        return (int)t;

    }
    private String ketqua(){
        if(trungbinh() < 5)
            return "Truot";
        if(trungbinh() == 5 || trungbinh() == 6)
            return "Trung binh";
        if(trungbinh() == 7)
            return "Kha";
        if(trungbinh() == 8)
            return "Gioi";
        return "Xuat sac";
    }
    private String chuyenhoa() {
        String ma = name.toLowerCase().trim();
        String [] tu = ma.split("\\s+");
        StringBuilder res = new StringBuilder();
        for(String i:tu){
            res.append(Character.toUpperCase(i.charAt(0))).append(i.substring(1)).append(" ");
        }
        return res.toString().trim();
    }
    public int age() {
        Date now = new Date();
        return now.getYear()-ngaysinh.getYear();
    }

    @Override
    public String toString() {
        return id+" "+chuyenhoa()+" "+age()+" "+trungbinh()+" "+ketqua();
    }

    @Override
    public int compareTo(tinh o) {
        if(o.trungbinh() == trungbinh()){
            return this.id.compareTo(o.id);
        }
        return o.trungbinh()>this.trungbinh() ? 1:-1;
    }
}
