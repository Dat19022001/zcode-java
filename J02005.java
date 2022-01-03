import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class J02005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer n = input.nextInt(), m = input.nextInt();
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[m];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        for (int i = 0; i < m; i++) {
            b[i] = input.nextInt();
        }

        SortedSet<Integer> s1 = new TreeSet<Integer>(Arrays.asList(a));
        SortedSet<Integer> s2 = new TreeSet<Integer>(Arrays.asList(b));
        s1.retainAll(s2);
        Integer[] c = s1.toArray(new Integer[s1.size()]);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
