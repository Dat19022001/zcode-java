package J05074;

public class Diemdanh {
    private String maSV,name,lop,danh;

    public Diemdanh(String maSV, String name, String lop, String danh) {
        this.maSV = maSV;
        this.name = name;
        this.lop = lop;
        this.danh = danh;
    }

    public String getMaSV() {
        return maSV;
    }
    private int diem(){
        int tb = 10;
        for(int i =0;i<danh.length();i++){
            if(danh.charAt(i)=='m'){
                tb -=1;
            }
            else if(danh.charAt(i)=='v'){
                tb-=2;
            }
            else {
                tb -=0;
            }
        }
        if (tb<0){
            return 0;
        }
        return tb;
    }
    private String chuthic(){
        if(diem()==0){
            return "KDDK";
        }
        return "";
    }

    @Override
    public String toString() {
        return maSV+" "+name+" "+lop+" "+diem()+" "+chuthic();
    }
}
