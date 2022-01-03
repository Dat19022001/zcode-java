package J05024;

public class dsNganh {
    private String id,name,lop,email;

    public dsNganh(String id, String name, String lop, String email) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    public Character getId() {
        return id.charAt(5);
    }

    public Character getLop() {
        return lop.charAt(0);
    }

    @Override
    public String toString() {
        return id+" "+name+" "+lop+" "+email;
    }
}
