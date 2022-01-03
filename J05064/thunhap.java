package J05064;

public class thunhap {
    private String id,name;
    private int lcb;

    public thunhap(String id, String name, int lcb) {
        this.id = id;
        this.name = name;
        this.lcb = lcb;
    }
    public String chucvu(){
       return id.substring(0,2);
    }
    private int heso(){
        String t = id.substring(2);
        return Integer.parseInt(t);
    }
    private int phucap(){
        if(chucvu().equals("HT"))
            return 2000000;
        if(chucvu().equals("HP"))
            return 900000;
        return 500000;
    }
    private int luong(){
        return lcb*heso()+phucap();
    }

    @Override
    public String toString() {
        return id+" "+name+" "+heso()+" "+phucap()+" "+luong();
    }
}
