package J05033;

public class thoigian implements Comparable<thoigian> {
    private int gio,phut,giay;

    public thoigian(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    @Override
    public String toString() {
        return gio+" "+phut+" "+giay;
    }

    @Override
    public int compareTo(thoigian o) {
        if(o.gio == this.gio){
            if(o.phut == this.phut) return this.giay-o.giay;
            else return this.phut -o.phut;
        }
        return this.gio-o.gio;
    }
}
