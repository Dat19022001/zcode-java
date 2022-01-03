package J05017;

public class tiendien implements Comparable<tiendien> {
    private String id,name;
    private int somoi,socu;

    public tiendien(int id, String name, int socu, int somoi) {
        this.id ="KH"+String.format("%02d",id+1);
        this.name = name;
        this.somoi = somoi;
        this.socu = socu;
    }
    private int tien(){
        int a = somoi-socu;
        if(a<50){
            return (int) Math.round(a*100*1.02);
        }
        else if(a<=100){
            return (int) Math.round((50*100+(a-50)*150)*1.03);
        }
        else{
            return (int)Math.round((50*100+50*150+(a-100)*200)*1.05);
        }
    }

    @Override
    public String toString() {
        return id+" "+name+" "+tien();
    }

    @Override
    public int compareTo(tiendien o) {
        return o.tien()-tien();
    }
}
