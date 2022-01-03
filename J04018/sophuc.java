package J04018;

public class sophuc {
    private int thuc,ao;

    public sophuc(int thuc, int ao) {
        this.thuc = thuc;
        this.ao = ao;
    }
    public sophuc tong(sophuc a){
        int thuc1 = this.thuc+a.thuc;
        int ao1 = this.ao+a.ao;
        sophuc t = new sophuc(thuc1,ao1);
        return t;
    }
    public sophuc tich(sophuc a){
        int thuc1 = this.thuc*a.thuc-this.ao*a.ao;
        int ao1 = this.thuc*a.ao+this.ao*a.thuc;
        sophuc t = new sophuc(thuc1,ao1);
        return t;
    }

    @Override
    public String toString() {
        if(ao < 0){
            return thuc+" - "+-ao+"i";
        }
        return thuc+" + "+ao+"i";
    }
}
