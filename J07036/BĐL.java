package J07036;


public class BĐL implements Comparable<BĐL> {
    private String maSV,name,lop,maMH,mon;
    private int tinchi;
    private float diem;

    public BĐL(String maSV, String name, String lop, String maMH, String mon, int tinchi, float diem) {
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

    public String getLop() {
        return lop;
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
            return maSV+" "+chuyenhoa()+" "+maMH+" "+mon+" "+(int)diem;
        }
        return maSV+" "+chuyenhoa()+" "+maMH+" "+mon+" "+diem;
    }

    @Override
    public int compareTo(BĐL o) {
        if(o.maMH == maMH){
            return maSV.compareTo(o.maSV);
        }
        return maMH.compareTo(o.maMH);
    }
}
