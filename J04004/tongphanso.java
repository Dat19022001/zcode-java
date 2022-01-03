package J04004;

public class tongphanso {
    private long tuso;
    private long mauso;

    public tongphanso(long tuso, long mauso) {
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
    public tongphanso tong(tongphanso b){
        long a = this.tuso*b.mauso + this.mauso*b.tuso;
        long c = this.mauso*b.mauso;
        tongphanso t = new tongphanso(a,c);
        return t;
    }
    @Override
    public String toString() {
        return tuso+"/"+mauso;
    }
}
