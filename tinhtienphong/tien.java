package tinhtienphong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class tien implements Comparable<tien> {
    private String id,name,sophong;
    private Date ngaynhan,ngaytra;
    private int bo;

    public tien(int id, String name,String sophong, String ngaynhan, String ngaytra, int bo) throws ParseException {
        this.id = "KH"+String.format("%02d",id+1);
        this.name = name;
        this.sophong = sophong;
        this.ngaynhan = new SimpleDateFormat("dd/MM/yyyy").parse(ngaynhan);
        this.ngaytra = new SimpleDateFormat("dd/MM/yyyy").parse(ngaytra);
        this.bo = bo;
    }

    private int ngayo(){
        long a =  ngaytra.getTime()-ngaynhan.getTime();
        TimeUnit t = TimeUnit.DAYS;
        return (int) t.convert(a,TimeUnit.MILLISECONDS)+1;
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
    private int tien(){
        Character a = sophong.charAt(0);
        if(a.equals('1')){
            return ngayo()*25+bo;
        }
        if(a.equals('2')){
            return ngayo()*34+bo;
        }
        if(a.equals('3')){
            return ngayo()*50+bo;
        }
        return ngayo()*80+bo;
    }

    @Override
    public String toString() {
        return id+" "+chuyenhoa()+" "+sophong+" "+ngayo()+" "+tien();
    }

    @Override
    public int compareTo(tien o) {
        return o.tien()-this.tien();
    }
}
