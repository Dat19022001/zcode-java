package J04015;

public class luong {
    private String id,name;
    private int lcb;

    public luong(String id, String name, int lcb) {
        this.id = id;
        this.name = name;
        this.lcb = lcb;
    }
    private int bacluong(){
        return Integer.parseInt(id.substring(2));
    }
    private int phucap(){
        String ma = id.substring(0,2);
        if(ma.equals("HT")){
            return 2000000;
        }
        if(ma.equals("HP")){
            return 900000;
        }
        return 500000;
    }
    public int thunhap(){
        return lcb*bacluong()+phucap();
    }

    @Override
    public String toString() {
        return id+" "+name+" "+bacluong()+" "+phucap()+" "+thunhap();
    }
}
