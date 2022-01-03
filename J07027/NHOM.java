package J07027;

public class NHOM implements Comparable<NHOM> {
    private String maSV,ten,sdt,id,tenBT;

    public NHOM(String maSV, String ten, String sdt, String id, String tenBT) {
        this.maSV = maSV;
        this.ten = ten;
        this.sdt = sdt;
        this.id = id;
        this.tenBT = tenBT;
    }

    @Override
    public String toString() {
        return maSV+" "+ten+" "+sdt+" "+id+" "+tenBT;
    }

    @Override
    public int compareTo(NHOM o) {
        return maSV.compareTo(o.maSV);
    }
}
