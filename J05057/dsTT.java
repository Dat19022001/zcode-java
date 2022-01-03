package J05057;

public class dsTT implements Comparable<dsTT> {
    private String maSV,name;
    private float toan,ly,hoa;

    public dsTT(String maSV, String name, float toan, float ly, float hoa) {
        this.maSV = maSV;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    private String diemKV(){
        String ma = maSV.substring(0,3);
        if(ma.equals("KV1"))
            return "0.5";
        if(ma.equals("KV2"))
            return "1";
        return "2.5";
    }
    private float tong(){
        return toan*2+ly+hoa+Float.parseFloat(diemKV());
    }
    private String ketqua(){
        float t =tong();
        if(t >=24){
            return "TRUNG TUYEN";
        }
        return "TRUOT";
    }

    @Override
    public String toString() {
        if(tong() == (int) tong()){
            return maSV+" "+name+" "+diemKV()+" "+(int)tong()+" "+ketqua();
        }
        else {
            return maSV + " " + name + " " + diemKV() + " " + String.format("%.1f", tong()) + " " + ketqua();
        }
    }

    @Override
    public int compareTo(dsTT o) {
        if(o.tong() == this.tong())
            return this.maSV.compareTo(o.maSV);
        return o.tong() > this.tong()? 1:-1;
    }
}
