package J04003;

public class phanso {
    private long tuso;
    private long mauso;

    public phanso(long tuso, long mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }
    public long UCLN(long a,long b){
        if(b==0) return a;
        return UCLN(b,a%b);
    }
    public void rutgon(){
        long a = this.tuso;long b = this.mauso;
        this.tuso=this.tuso /UCLN(a,b);
        this.mauso=this.mauso/UCLN(a,b);
    }
    @Override
    public String toString() {
        return tuso+"/"+mauso;
    }
}
