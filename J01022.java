import java.util.Scanner;

public class J01022 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        long[] f = new long [94];
        f[1]=1;
        f[2]=1;
        for (int i = 3; i < 93; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        while(t-- >0) {
            int n = input.nextInt();
            long k = input.nextLong();
            System.out.println(fibo(n, k,f));
        }
    }

    public static char fibo(int n, long k,long[] fi) {
        if(n==1) return '0';
        if(n==2) return '1';
        if(k <= fi[n-2])
            return fibo(n-2, k, fi);
        return fibo(n-1, k-fi[n-2], fi);
    }
}
