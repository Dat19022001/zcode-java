package J07054;

import java.util.Locale;

public class thutu implements Comparable<thutu> {
    private String id,name;
    private int mon1,mon2,mon3;

    public thutu(int id, String name, int mon1, int mon2, int mon3) {
        this.id ="SV"+String.format("%02d",id+1);
        this.name = name;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }
    private String chuyenhoa(){
        String ma = this.name.toLowerCase().trim();
        String [] tu = ma.split("\\s+");
        StringBuilder res = new StringBuilder();
        for(String i:tu){
            res.append(Character.toUpperCase(i.charAt(0))).append(i.substring(1)).append(" ");
        }
        return res.toString().trim();
    }
    public float trungbinh(){
        return (float) (mon1*3+mon2*3+mon3*2)/8;
    }

    @Override
    public String toString() {
        return id+" "+chuyenhoa()+" "+String.format("%.2f",trungbinh());
    }

    @Override
    public int compareTo(thutu o) {
        if(o.trungbinh()==trungbinh())
            return id.compareTo(o.id);
        return o.trungbinh()>this.trungbinh() ? 1:-1;
    }
}
