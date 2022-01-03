package J07048;

public class sanpham implements Comparable<sanpham> {
    private String id,ten;
    public int gia,thoihan;

    public sanpham(String id, String ten, int gia, int thoihan) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.thoihan = thoihan;
    }

    @Override
    public String toString() {
        return id+" "+ten+" "+gia+" "+thoihan;
    }

    @Override
    public int compareTo(sanpham o) {
        if(o.gia==gia)
            return id.compareTo(o.id);
        return o.gia-gia;
    }
}
