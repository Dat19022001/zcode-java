package J06004;

public class sv {
    private String maSv,name,sdt;
    private int nhom;

    public sv(String maSv, String name, String sdt, int nhom) {
        this.maSv = maSv;
        this.name = name;
        this.sdt = sdt;
        this.nhom = nhom;
    }

    public String getMaSv() {
        return maSv;
    }

    public String getName() {
        return name;
    }

    public String getSdt() {
        return sdt;
    }

    public int getNhom() {
        return nhom;
    }
}
