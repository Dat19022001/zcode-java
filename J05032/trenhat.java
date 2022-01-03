package J05032;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class trenhat implements Comparable<trenhat> {
    private String name;
    private Date ngaysinh;

    public trenhat(String name, String ngaysinh) throws ParseException {
        this.name = name;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
    }


    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(trenhat o) {
        return this.ngaysinh.compareTo(o.ngaysinh);
    }
}
