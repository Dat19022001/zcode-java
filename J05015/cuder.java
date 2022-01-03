package J05015;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class cuder implements Comparable<cuder> {
    private String name,diadiem;
    private Date end;

    public cuder(String name, String diadiem, String end) throws ParseException {
        this.name = name;
        this.diadiem = diadiem;
        this.end =new SimpleDateFormat("H:mm").parse(end);
    }
    private String ma(){
        String ma1 = name.toLowerCase().trim();
        String diachi1 = diadiem.toLowerCase().trim();
        String [] tu1 = diachi1.split("\\s+");
        String [] tu = ma1.split("\\s+");
        StringBuilder ds = new StringBuilder();
        for(String i:tu1){
            ds.append(Character.toUpperCase(i.charAt(0)));
        }
        for(String i:tu){
            ds.append(Character.toUpperCase(i.charAt(0)));
        }
        return ds.toString().trim();
    }
    private int vanToc() {
        float gio = (end.getHours() - 6) + (end.getMinutes() * 1f) / 60;
        return (int) Math.round(120 / gio);
    }

    @Override
    public String toString() {
        return ma()+" "+name+" "+diadiem+" "+vanToc()+" Km/h";
    }

    @Override
    public int compareTo(cuder o) {
        return end.compareTo(o.end);
    }
}
