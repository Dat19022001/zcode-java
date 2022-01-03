package J04001;

public class layout {
    private Poin p1,p2;

    public layout(Poin p1, Poin p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return String.format("%.4f",Poin.Distance(p1,p2));
    }
}
