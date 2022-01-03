import java.util.Scanner;

public class J01021 {
    static int mod = 1000000007;
    static long mul(long a,long b){
        if(b==0) return 1;
        if(b==1) return a%mod;
        long p=mul(a,b/2);
        p=p*p%mod;
        if(b%2==0) return p%mod;
        return p*a%mod;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            long n=input.nextLong(),m= input.nextLong();
            if(n!=0||m!=0){
                System.out.println(mul(n,m));
            }
            else break;
        }
    }
}
