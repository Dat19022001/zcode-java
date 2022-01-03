package J04014;

public class tongphanso {
    private long tuso,mauso;

    public tongphanso(long tuso, long mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }
    private long UCLN(long a,long b){
        if(b==0) return a;
        return UCLN(b,a%b);
    }
    private void rutgon(){
        long a = this.tuso;long b = this.mauso;
        if(a < 0) a = -a;
        if(b < 0) b = -b;
        this.tuso=this.tuso /UCLN(a,b);
        this.mauso=this.mauso/UCLN(a,b);
    }
    tongphanso tong(tongphanso b){
        long c = this.tuso*b.mauso+this.mauso*b.tuso;
        long d = this.mauso*b.mauso;
        tongphanso t = new tongphanso(c,d);
        t.rutgon();
        return t;
    }
    tongphanso getC(){
        long tu = tuso * tuso;
        long mau = mauso*mauso;
        tongphanso ps = new tongphanso(tu,mau);
        ps.rutgon();
        return ps;
    }
    tongphanso getD(tongphanso a,tongphanso b){
        long tu = tuso * a.tuso *b.tuso;
        long mau = mauso *a.mauso*b.mauso;
        tongphanso ps = new tongphanso(tu,mau);
        ps.rutgon();
        return ps;
    }

    @Override
    public String toString() {
        if (mauso < 0){
            return -tuso+"/"+-mauso;
        }
        return  tuso+"/"+mauso;
    }
}
