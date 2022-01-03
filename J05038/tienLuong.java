package J05038;

public class tienLuong implements Comparable<tienLuong> {
    private String id,name;
    private int luongngay,ngaycong;
    private String chucvu;

    public tienLuong(int id, String name, int luongngay, int ngaycong, String chucvu) {
        this.id ="NV"+String.format("%02d",id+1);
        this.name = name;
        this.luongngay = luongngay;
        this.ngaycong = ngaycong;
        this.chucvu = chucvu;
    }
    private int phucapCV(){
        if(chucvu.equals("GD"))
            return 250000;
        if(chucvu.equals("PGD"))
            return 200000;
        if(chucvu.equals("TP"))
            return 180000;
        return 150000;
    }
    private int luongThang(){
        return luongngay*ngaycong;
    }
    private int thuong(){
        if(ngaycong >= 25)
            return (int) (luongThang()*0.2f);
        else if(ngaycong >=22)
            return (int) (luongThang()*0.1f);
        else
            return 0;
    }
    public int thuclinh(){
        return luongThang()+phucapCV()+thuong();
    }

    @Override
    public String toString() {
        return id+" "+name+" "+luongThang()+" "+thuong()+" "+phucapCV()+" "+thuclinh();
    }

    @Override
    public int compareTo(tienLuong o) {
        return o.thuclinh()-thuclinh();
    }
}
