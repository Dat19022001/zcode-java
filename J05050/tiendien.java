package J05050;

public class tiendien implements Comparable<tiendien> {
    private String ma,name;
    private int cu,moi;

    public tiendien(int ma, String name, int cu, int moi) {
        this.ma ="KH"+String.format("%02d",ma+1);
        this.name = name;
        this.cu = cu;
        this.moi = moi;
    }
    private int heso(){
        if(name.equals("KD"))
            return 3;
        if(name.equals("NN"))
            return 5;
        if(name.equals("TT"))
            return 4;
        return 2;
    }
    private int tien(){
        return (moi-cu)*heso()*550;
    }
    private int phutroi(){
        if((moi-cu) < 50)
            return 0;
        else if((moi -cu)<=100)
            return  Math.round(0.35f*tien());
        else
            return tien();
    }
    private int tong(){
        return phutroi()+tien();
    }

    @Override
    public String toString() {
        return ma+" "+heso()+" "+tien()+" "+phutroi()+" "+tong();
    }

    @Override
    public int compareTo(tiendien o) {
        return o.tong()-this.tong();
    }
}
