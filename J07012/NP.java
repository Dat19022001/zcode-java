package J07012;

public class NP implements Comparable<NP> {
    private String key;
    private int value;

    public NP(String key, int value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return key + " " + value;
    }

    @Override
    public int compareTo(NP o) {
        if(o.value==value){
            return key.compareTo(o.key);
        }
        return o.value-value;
    }
}
