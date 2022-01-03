package J05010;

public class sapxepHH implements Comparable<sapxepHH> {
    private int id;
    private String name,nhomhang;
    private double giamua,giaban;

    public sapxepHH(int id, String name, String nhomhang, double giamua, double giaban) {
        this.id = id+1;
        this.name = name;
        this.nhomhang = nhomhang;
        this.giamua = giamua;
        this.giaban = giaban;
    }
    private double gia(){
        return giaban-giamua;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+nhomhang+" "+String.format("%.2f",gia());
    }

    @Override
    public int compareTo(sapxepHH o) {
        return o.gia()>this.gia() ? 1:-1;
    }
}
