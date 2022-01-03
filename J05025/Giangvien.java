package J05025;

import java.util.Locale;

public class Giangvien implements Comparable<Giangvien> {
    private String id,name,nganh;

    public Giangvien(int id, String name, String nganh) {
        this.id ="GV"+String.format("%02d",id+1);
        this.name = name;
        this.nganh = nganh;
    }
    private String chuyennganh(){
        String [] res = nganh.split("\\s+");
        String ten = "";
        for(String i:res){
            ten +=i.charAt(0);
        }
        return ten.toUpperCase();
    }
    private String name1(){
        String [] res1 = name.split("\\s+");
        return res1[res1.length-1];
    }

    @Override
    public String toString() {
        return id+" "+name+" "+chuyennganh();
    }

    @Override
    public int compareTo(Giangvien o) {
        if(o.name1().equals(this.name1()))
            return this.id.compareTo(o.id);
        return this.name1().compareTo(o.name1());
    }
}
