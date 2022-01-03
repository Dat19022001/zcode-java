package J05020;

public class dsSinhvien implements Comparable<dsSinhvien>  {
    private String id,name,lop,email;

    public dsSinhvien(String id, String name, String lop, String email) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+lop+" "+email;
    }

    @Override
    public int compareTo(dsSinhvien o) {
        return this.id.compareTo(o.id);
    }
}
