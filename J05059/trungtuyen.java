package J05059;

public class trungtuyen implements Comparable<trungtuyen> {
    private String id,name;
    private float mon1,mon2,mon3;

    public trungtuyen(String id, String name, float mon1, float mon2, float mon3) {
        this.id = id;
        this.name = name;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
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
    private String uutien(){
        if(id.charAt(2)=='1')
            return "0.5";
        if(id.charAt(2)=='2')
            return "1";
        return "2.5";
    }
    public float tong(){
        return mon1*2+mon2+mon3+Float.parseFloat(uutien());
    }
    private String convert(float x) {
        if((int) x == x)
            return String.format("%d", (int) x);
        return String.format("%.1f", x);
    }

    @Override
    public String toString() {
        return id+" "+chuyenhoa()+" "+uutien()+" "+convert(tong());
    }

    @Override
    public int compareTo(trungtuyen o) {
        if(o.tong()==tong())
            return this.id.compareTo(o.id);
        return o.tong() >this.tong()?1:-1;
    }
}
