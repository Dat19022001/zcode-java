package J05054;

public class thuhang  {
    private String id,name;
    private float tb;

    public thuhang(int id, String name, float tb) {
        this.id ="HS"+String.format("%02d",id+1);
        this.name = name;
        this.tb = tb;
    }

    public float getTb() {
        return tb;
    }
    private String xepLoai() {
        if(tb < 5)
            return "Yeu";
        if(tb < 7)
            return "Trung Binh";
        if(tb < 9)
            return "Kha";
        return "Gioi";
    }

    @Override
    public String toString() {
        return id+" "+name+" "+tb+" "+xepLoai();
    }

}
