package J05043;

public class TinhLuong implements Comparable<TinhLuong> {
    private String id,name,chucvu;
    private int lcb,ngaycong;

    public TinhLuong(int id, String name, String chucvu, int lcb, int ngaycong) {
        this.id ="NV"+String.format("%02d",id+1);
        this.name = name;
        this.chucvu = chucvu;
        this.lcb = lcb;
        this.ngaycong = ngaycong;
    }

    public String getChucvu() {
        return chucvu;
    }

    private int luong(){
        return ngaycong*lcb;
    }
    private int phucapCV(){
        if(chucvu.equals("GD"))
            return 500;
        if(chucvu.equals("PGD"))
            return 400;
        if(chucvu.equals("TP"))
            return 300;
        if(chucvu.equals("KT"))
            return 250;
        return 100;
    }
    private int phucap(){
        if(((phucapCV()+luong())*2)/3 <25000)
            return (int)  (Math.round((((phucapCV()+luong())*2)/3)*0.001)/0.001);
        else
            return 25000;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+phucapCV()+" "+luong()+" "+phucap()+" "+(luong()-phucap()+phucapCV());
    }

    @Override
    public int compareTo(TinhLuong o) {
        if((o.luong()+o.phucapCV()) == (this.luong()+this.phucapCV()))
            return this.id.compareTo(o.id);
        return (o.luong()+o.phucapCV())-(this.luong()+this.phucapCV()) ;
    }
}
