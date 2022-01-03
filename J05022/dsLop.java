package J05022;

public class dsLop {
    private String id,name,lop,email;

    public dsLop(String id, String name, String lop, String email) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+lop+" "+email;
    }
}
