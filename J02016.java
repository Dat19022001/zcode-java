import java.util.Arrays;
import java.util.Scanner;

public class J02016 {
    static long [] a= new long[5008];

    static Scanner input=new Scanner(System.in);
    static void Pytago() {
        int n = input.nextInt(), dem = 0;
        for (int i = 0; i < n; i++) {
            a[i] = input.nextLong();
            a[i] *= a[i];
        }
        Arrays.sort(a, 0, n);
        for (int i = n - 1; i >= 2; i--) {
            int l = 0, r = i - 1;
            while (l < r) {
                if (a[l] + a[r] == a[i]) {
                    dem++;
                    break;
                }
                if (a[l] + a[r] < a[i]) {
                    l++;
                } else
                    r--;
            }

        }
        if (dem == 0)
            System.out.println("NO");
        else System.out.println("YES");
    }
    public static void main(String[] args) {
        int t = input.nextInt();
        while (t-- > 0) {
            Pytago();
        }
    }
}
