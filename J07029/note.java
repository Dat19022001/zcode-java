package J07029;

public class note implements Comparable<note>{
    private int key,value;

    public note(int key, int value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return key+" "+value;
    }

    @Override
    public int compareTo(note o) {
        return o.key-this.key;
    }
}
