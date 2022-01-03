import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02029 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-->0) {
            int n = input.nextInt();
            int[] a = new int[n+1];
            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
            }
            ArrayList<String> all = new ArrayList<>();

            for (int i = 0; i < n-1; i++) {
                for (int j = i+1; j < n; j++) {
                    if(a[i] > a[j]) {
                        int tmp = a[i]; a[i] = a[j]; a[j] = tmp;
                    }
                }
                String res = "Buoc " + (i+1) + ": ";
                for (int j = 0; j < n; j++) {
                    res+= a[j] + " ";
                }
                all.add(res);
            }
            Collections.reverse(all);
            for (String i : all) {
                System.out.println(i);
            }
        }
    }
}
