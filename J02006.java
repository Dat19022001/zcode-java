import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class J02006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt();
        SortedSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < a; i++) {
            set.add(input.nextInt());
        }
        for (int i = 0; i < b; i++) {
            set.add(input.nextInt());
        }
        for (Integer i : set)
            System.out.print(i + " ");
    }
}
