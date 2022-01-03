package J07027;

public class BTL {
    private String id,tenBT;

    public BTL(int id, String tenBT) {
        this.id = String.format(String.valueOf(id+1));
        this.tenBT = tenBT;
    }

    public String getId() {
        return id;
    }

    public String getTenBT() {
        return tenBT;
    }
}
