package J07011;

public class Tu implements Comparable<Tu> {
    private String key;
    private int value;

    public Tu(String key, int value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return key+" "+value;
    }

    @Override
    public int compareTo(Tu o) {
        if(o.value==value){
            return key.compareTo(o.key);
        }
        return o.value-value;
    }
}
