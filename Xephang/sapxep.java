package Xephang;

public class sapxep implements Comparable<sapxep> {
    private String id;
    private String name,nhomhang;
    private float mua,ban;

    public sapxep(int id, String name, String nhomhang, float mua, float ban) {
        this.id = "MH"+String.format("%02d",id+1);
        this.name = name;
        this.nhomhang = nhomhang;
        this.mua = mua;
        this.ban = ban;
    }
    private float loinhuan(){
        return (float) this.ban-this.mua;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+nhomhang+" "+String.format("%.2f",loinhuan());
    }


    @Override
    public int compareTo(sapxep o) {
       return o.loinhuan() > this.loinhuan() ? 1 : -1;
    }
}
