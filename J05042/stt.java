package J05042;

public class stt implements Comparable<stt> {
    private String name;
    private int dung,dalam;

    public stt(String name, int dung, int dalam) {
        this.name = name;
        this.dung = dung;
        this.dalam = dalam;
    }

    @Override
    public String toString() {
        return name+" "+dung+" "+dalam;
    }

    @Override
    public int compareTo(stt o) {
        if(this.dung == o.dung){
            if(this.dalam == o.dalam)
                return this.name.compareTo(o.name);
            return this.dalam-o.dalam;
        }
        return o.dung-this.dung;
    }
}
