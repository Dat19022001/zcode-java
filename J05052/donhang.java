package J05052;

public class donhang implements Comparable<donhang> {
    private String name,ma;
    private int dongia,sl;

    public donhang(String name, String ma, int dongia, int sl) {
        this.name = name;
        this.ma = ma;
        this.dongia = dongia;
        this.sl = sl;
    }
    private String stt(){
        return ma.substring(1,4);
    }
    private int giamgia(){
        if(ma.charAt(4)=='1')
            return (int) (sl*dongia*0.5f);
        return (int) (sl*dongia*0.3f);
    }
    private int tien(){
        return (sl*dongia)-giamgia();
    }

    @Override
    public String toString() {
        return name+" "+ma+" "+stt()+" "+giamgia()+" "+tien();
    }

    @Override
    public int compareTo(donhang o) {
        return this.stt().compareTo(o.stt());
    }
}
