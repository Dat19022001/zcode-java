package J05046;

public class kho  {
    private String name;
    private int soluong,dongia;

    public kho(String name, int soluong, int dongia) {
        this.name = name;
        this.soluong = soluong;
        this.dongia = dongia;
    }
    private float chietkhau(){
        if(soluong > 10)
            return 0.05f;
        else if(soluong >=8)
            return 0.02f;
        else if(soluong >=5)
            return 0.01f;
        else
            return 0.00f;
    }

    public String getName() {
        String[] tmp = name.split("\\s+");
        String res = "";
        for (int i = 0; i < tmp.length - 1; i++) {
            res+=tmp[i].charAt(0);
        }
        return res.toUpperCase();
    }

    private int tiengiam(){
        return (int) (dongia*soluong*chietkhau());
    }
    private int thanhtien(){
        return dongia*soluong-tiengiam();
    }

    @Override
    public String toString() {
        return name+" "+tiengiam()+" "+thanhtien();
    }

}
