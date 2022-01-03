package J05034;

public class DSTT implements Comparable<DSTT> {
    private int id;
    private String maSV,name,lop,email,DN;

    public DSTT(int id, String maSV, String name, String lop, String email, String DN) {
        this.id = id+1;
        this.maSV = maSV;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.DN = DN;
    }

    public String getDN() {
        return DN;
    }

    @Override
    public String toString() {
        return id+" "+maSV+" "+name+" "+lop+" "+email+" "+DN;
    }

    @Override
    public int compareTo(DSTT o) {
        return this.maSV.compareTo(o.maSV);
    }
}
