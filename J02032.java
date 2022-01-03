import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02032 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-->0) {
            int n = input.nextInt();
            int[] a = new int[n+1];
            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
            }
            ArrayList<String> al = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                boolean kiemtra = false;
                for (int j = 0; j < n-i-1; j++) {
                    if(a[j] > a[j+1]) {
                        int tmp = a[j]; a[j] = a[j+1]; a[j+1] = tmp;
                        kiemtra = true;
                    }
                }
                if(!kiemtra) break;
                StringBuilder res = new StringBuilder("Buoc " + (i + 1) + ": ");
                for (int j = 0; j < n; j++) {
                    res.append(a[j]).append(" ");
                }
                al.add(res.toString());
            }
            Collections.reverse(al);
            for (String x : al) {
                System.out.println(x);
            }
        }
    }
}
