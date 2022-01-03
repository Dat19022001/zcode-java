package J05023;

public class dsKhoa {
    private String id,name,lop,email;

    public dsKhoa(String id, String name, String lop, String email) {
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
