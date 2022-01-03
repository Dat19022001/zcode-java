import java.util.Scanner;

public class J02022 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            Integer[] a = new Integer[n+1];
            Boolean[] kiemtra = new Boolean[n+1];
            for (int i = 1; i <=n ; i++) {
                a[0] = i;
                khoitao(n, kiemtra);
                kiemtra[i] = false;
                thuchine(1, n, a, kiemtra);
            }
        }
    }

    static  void khoitao(int n, Boolean[] kiemtra) {
        for (int i = 1; i <= n ; i++) {
            kiemtra[i] = true;
        }
    }

    static void thuchine(int i, int n, Integer[] a, Boolean[] kiemtra) {
        if(i >= n)
            return;
        for (int j = 1; j <= n; j++) {
            if(kiemtra[j] && Math.abs(j - a[i-1]) != 1) {
                kiemtra[j] = false;
                a[i] = j;
                if(i==n-1)
                    in(n, a);
                thuchine(i+1, n, a, kiemtra);
                kiemtra[j] = true;
            }
        }
    }

    static void in(int n, Integer[] arr) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
