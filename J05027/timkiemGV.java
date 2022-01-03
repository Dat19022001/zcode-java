package J05027;


public class timkiemGV {
    private String id,name,nganh;

    public timkiemGV(int id, String name, String nganh) {
        this.id = "GV"+String.format("%02d",id+1);
        this.name = name;
        this.nganh = nganh;
    }
    public boolean search(String key){
        String name1 = name.toLowerCase();
        return name1.contains(key.toLowerCase());
    }
    private String chuyennganh(){
        String [] res = nganh.split("\\s+");
        String ten = "";
        for(String i:res){
            ten +=i.charAt(0);
        }
        return ten.toUpperCase();
    }

    @Override
    public String toString() {
        return id+" "+name+" "+chuyennganh();
    }
}
