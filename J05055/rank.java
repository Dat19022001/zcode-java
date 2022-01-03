package J05055;

public class rank implements Comparable<rank>  {
    private String id,name,thanh,uutien,ketqua;
    private int rank1;

    public rank(String id, String name, String thanh, String uutien, String ketqua, int rank1) {
        this.id = id;
        this.name = name;
        this.thanh = thanh;
        this.uutien = uutien;
        this.ketqua = ketqua;
        this.rank1 = rank1;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+thanh+" "+uutien+" "+ketqua+" "+rank1;
    }

    @Override
    public int compareTo(J05055.rank o) {
        return this.rank1 -o.rank1;
    }
}
