package J05011;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class choigame implements Comparable<choigame> {
    private String id,name;
    private Date giovao,giora;

    public choigame(String id, String name, String giovao, String giora) throws ParseException {
        this.id = id;
        this.name = name;
        this.giovao = new SimpleDateFormat("hh:mm").parse(giovao) ;
        this.giora = new SimpleDateFormat("hh:mm").parse(giora);
    }
    public long thoigian(){
        return ((giora.getTime()-giovao.getTime())/60/1000);
    }

    @Override
    public String toString() {
        return id+" "+name+" "+thoigian()/60+" gio "+thoigian()%60+" phut";
    }

    @Override
    public int compareTo(choigame o) {
        return o.thoigian()>this.thoigian() ? 1:-1;
    }
}
