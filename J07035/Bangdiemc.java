package J07035;

import java.util.Locale;

public class Bangdiemc implements Comparable<Bangdiemc> {
    private String maSV,name,lop,maMH,mon;
    private int tinchi;
    private float diem;

    public Bangdiemc(String maSV, String name, String lop, String maMH, String mon, int tinchi, float diem) {
        this.maSV = maSV;
        this.name = name;
        this.lop = lop;
        this.maMH = maMH;
        this.mon = mon;
        this.tinchi = tinchi;
        this.diem = diem;
    }

    public String getMaMH() {
        return maMH;
    }

    public String getMon() {
        return mon;
    }
    private String chuyenhoa(){
        String name1 = name.toLowerCase().trim();
        String [] tu = name1.split("\\s+");
        StringBuilder d = new StringBuilder();
        for(String i:tu){
            d.append(Character.toUpperCase(i.charAt(0))).append(i.substring(1)).append(" ");
        }
        return d.toString().trim();
    }

    @Override
    public String toString() {
        if(diem == (int) diem){
            return maSV+" "+chuyenhoa()+" "+lop+" "+(int)diem;
        }
        return maSV+" "+chuyenhoa()+" "+lop+" "+diem;
    }

    @Override
    public int compareTo(Bangdiemc o) {
        if(o.diem == diem){
            return maSV.compareTo(o.maSV);
        }
        return o.diem > this.diem ? 1:-1;
    }
}
