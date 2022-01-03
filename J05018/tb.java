package J05018;

public class tb implements Comparable<tb> {
    private String id,a ,b;

    public tb(int id, String a, String b) {
        this.id = "HS"+String.format("%02d",id+1);
        this.a = a;
        this.b = b;
    }

    private float tb1(){
        String [] s = b.split("\\s+");
        float tong = 0;
        for(int i = 0;i<s.length;i++){
            if(i==0||i==1){
                tong +=Float.parseFloat(s[i]);
            }
            tong +=Float.parseFloat(s[i]);
        }
        float t = tong/12;
        return (float) Math.round(t*10)/10;
    }
    private String ketqua(){
        if(tb1() >=9.0)
            return "XUAT SAC";
        if(tb1()>=8.0)
            return "GIOI";
        if(tb1()>=7.0)
            return "KHA";
        if(tb1()>=5.0)
            return "TB";
        return "YEU";
    }

    @Override
    public String toString() {
        return id+" "+a+" "+String.format("%.1f",tb1())+" "+ketqua();
    }

    @Override
    public int compareTo(tb o) {
        if(o.tb1() > this.tb1())
            return 1;
        if(o.tb1() < this.tb1())
            return -1;
        return this.id.compareTo(o.id);
    }
}
