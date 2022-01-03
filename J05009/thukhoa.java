package J05009;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class thukhoa {
    private int id;
    private String name,ngaysinh;
    private float mon1,non2,mon3;

    public thukhoa(int id, String name, String ngaysinh, float mon1, float non2, float mon3) throws ParseException {
        this.id = id+1;
        this.name = name;
        this.ngaysinh = ngaysinh;
        this.mon1 = mon1;
        this.non2 = non2;
        this.mon3 = mon3;
    }
    public float tong(){
        return mon1+non2+mon3;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+ngaysinh+" "+tong();
    }
}
