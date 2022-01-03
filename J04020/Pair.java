package J04020;

public class Pair {
    private int a,b;

    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public boolean prime(int k){
        if(k < 2) return false;
        for(int i = 2;i<=(int) Math.sqrt(k);i++){
            if (k % i==0) return false;
        }
        return true;
    }
    public boolean isPrime(){
        return prime(a) && prime(b);
    }

    @Override
    public String toString() {
        return a+" "+b;
    }
}
