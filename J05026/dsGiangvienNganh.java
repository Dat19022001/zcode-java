package J05026;

public class dsGiangvienNganh {
    private String id,name,nganh;

    public dsGiangvienNganh(int id, String name, String nganh) {
        this.id ="GV"+String.format("%02d",id+1);
        this.name = name;
        this.nganh = nganh;
    }

    public String getNganh() {
        return nganh;
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
    public String  toString() {
        return id+" "+name+" "+chuyennganh();
    }
}
