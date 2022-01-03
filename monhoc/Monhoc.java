package monhoc;

public class Monhoc implements Comparable<Monhoc> {
    private String id;
    private String name;
    private int tinchi;

    public Monhoc(String id, String name, int tinchi) {
        this.id = id;
        this.name = name;
        this.tinchi = tinchi;
    }

    @Override
    public String toString() {
        return id +" "+name+" "+tinchi;
    }

    @Override
    public int compareTo(Monhoc o) {
        return this.name.compareTo(o.name) ;
    }
}
