package J05081;

public class hang implements Comparable<hang> {
    private String id,name,donvi;
    private int giamua,giaban;

    public hang(int id, String name, String donvi, int giamua, int giaban) {
        this.id ="MH"+String.format("%03d",id+1);
        this.name = name;
        this.donvi = donvi;
        this.giamua = giamua;
        this.giaban = giaban;
    }
    private int loinhuan(){
        return (int) giaban-giamua;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+donvi+" "+giamua+" "+giaban+" "+loinhuan();
    }

    @Override
    public int compareTo(hang o) {
        if(o.loinhuan()==loinhuan()){
            return this.id.compareTo(o.id);
        }
        return o.loinhuan()-loinhuan();
    }
}
