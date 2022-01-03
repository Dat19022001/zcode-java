package J07057;

public class dotruot implements Comparable<dotruot> {
    private String id,name;
    private float diem;
    private String dantoc,khuvuc;

    public dotruot(int id, String name, float diem, String dantoc, String khuvuc) {
        this.id ="TS"+String.format("%02d",id+1);
        this.name = name;
        this.diem = diem;
        this.dantoc = dantoc;
        this.khuvuc = khuvuc;
    }
    private String chuyenhoa(){
        String ma = name.toLowerCase().trim();
        String [] tu = ma.split("\\s+");
        StringBuilder res = new StringBuilder();
        for(String i:tu){
            res.append(Character.toUpperCase(i.charAt(0))).append(i.substring(1)).append(" ");
        }
        return res.toString().trim();
    }
    private String diemKV(){
        if(khuvuc.equals("1"))
            return "1.5";
        if(khuvuc.equals("2"))
            return "1";
        return "0";
    }
    private String diemDT(){
        if(dantoc.equals("Kinh"))
            return "0";
        return "1.5";
    }
    private float tong(){
        return diem+Float.parseFloat(diemDT())+Float.parseFloat(diemKV());
    }
    private String ketqua(){
        if(tong()>=20.5)
            return "Do";
        return "Truot";
    }

    @Override
    public String toString() {
        return id+" "+chuyenhoa()+" "+String.format("%.1f",tong())+" "+ketqua();
    }

    @Override
    public int compareTo(dotruot o) {
        if(o.tong()==tong())
            return id.compareTo(o.id);
        return o.tong()>this.tong() ? 1:-1;
    }
}
