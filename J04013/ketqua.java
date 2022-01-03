package J04013;

public class ketqua {
   private String id,name;
   private double toan,ly,hoa;

    public ketqua(String id, String name, double toan, double ly, double hoa) {
        this.id = id;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    private String khuvuc(){
        String ma = id.substring(0,3);
        if(ma.equals("KV3")){
            return "2.5";
        }
        if(ma.equals("KV2")){
            return "1";
        }
        return "0.5";
    }
    private double tong(){
        return toan*2+ly+hoa;
    }
    private double tongdiem(){
        return Double.parseDouble(khuvuc())+tong();
    }
    private String thongbao(){
        if(tongdiem()>=24){
            return "TRUNG TUYEN";
        }
        return "TRUOT";
    }

    @Override
    public String toString() {
        if (tongdiem() == (int)tongdiem()){
            return id+" "+name+" "+khuvuc()+" "+(int)tong()+" "+thongbao();
        }
        return id+" "+name+" "+khuvuc()+" "+String.format("%.1f",tong())+" "+thongbao();
    }
}
