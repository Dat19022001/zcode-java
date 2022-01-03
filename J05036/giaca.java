package J05036;

public class giaca implements Comparable<giaca> {
    private String id,name,donvi;
    private int dongia,sl;

    public giaca(int id, String name, String donvi, int dongia, int sl) {
        this.id ="MH"+String.format("%02d",id+1);
        this.name = name;
        this.donvi = donvi;
        this.dongia = dongia;
        this.sl = sl;
    }

    private int phivanchuyen(){
        return Math.round(dongia*sl*0.05f);
    }
    private int thanhtien(){
        return Math.round(sl*dongia+phivanchuyen());
    }
    private double giaban(){
        return Math.ceil(thanhtien() * 1.02 / sl * 0.01) / 0.01;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+donvi+" "+phivanchuyen()+" "+thanhtien()+" "+String.format("%.0f",giaban());
    }

    @Override
    public int compareTo(giaca o) {
        return o.giaban()>this.giaban()?1:-1;
    }
}
