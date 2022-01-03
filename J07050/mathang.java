package J07050;

public class mathang implements Comparable<mathang> {
    private String id,name,mahang;
    private float mua,ban;

    public mathang(int id, String name, String mahang, float mua, float ban) {
        this.id ="MH"+String.format("%02d",id+1);
        this.name = name;
        this.mahang = mahang;
        this.mua = mua;
        this.ban = ban;
    }
    private float loinhuan(){
        return ban-mua;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+mahang+" "+String.format("%.2f",loinhuan());
    }

    @Override
    public int compareTo(J07050.mathang o) {
        return o.loinhuan()>this.loinhuan()? 1:-1;
    }
}
