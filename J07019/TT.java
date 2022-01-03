package J07019;

public class TT {
    private String id,ma1,ten;
    private long sl,loai1,loai2;

    public TT(int id, String ma1, String ten, long sl, long loai1, long loai2) {
        this.id = "-"+String.format("%03d",id+1);
        this.ma1 = ma1;
        this.ten = ten;
        this.sl = sl;
        this.loai1 = loai1;
        this.loai2 = loai2;
    }
    private long tien(){
        if(ma1.charAt(2)=='1'){
            return sl*loai1;
        }
        return sl*loai2;
    }
    private long giam(){
        if(sl>=150){
            return (long) (tien()*0.5);
        }
        else if(sl>=100){
            return (long) (tien()*0.3);
        }
        else if(sl>=50) {
            return (long) (tien() * 0.15);
        }
        return 0;
    }
    private long tra(){
        return tien()-giam();
    }

    @Override
    public String toString() {
        return ma1+id+" "+ten+" "+giam()+" "+tra();
    }
}
