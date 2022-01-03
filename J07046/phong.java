package J07046;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class phong implements Comparable<phong> {
    private String id,name,maP;
    private Date ngayden,ngaydi;

    public phong(int id, String name, String maP, String ngayden, String ngaydi) throws ParseException {
        this.id ="KH"+String.format("%02d",id+1);
        this.name = name;
        this.maP = maP;
        this.ngayden = new SimpleDateFormat("dd/MM/yyyy").parse(ngayden);
        this.ngaydi = new SimpleDateFormat("dd/MM/yyyy").parse(ngaydi);
    }
    private int ngayo(){
        long a =  ngaydi.getTime()-ngayden.getTime();
        TimeUnit t = TimeUnit.DAYS;
        return (int) t.convert(a,TimeUnit.MILLISECONDS);
    }

    @Override
    public String toString() {
        return id+" "+name+" "+maP+" "+ngayo();
    }

    @Override
    public int compareTo(phong o) {
        return o.ngayo()-this.ngayo();
    }
}
