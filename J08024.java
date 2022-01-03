import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class J08024 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- >0) {
            int n = input.nextInt();
            Queue<String> q = new LinkedList<>();
            q.add("9");
            while (!q.isEmpty()) {
                Integer num = Integer.parseInt(q.peek());
                q.remove();
                if(num%n == 0) {
                    System.out.println(num);
                    break;
                }
                q.add(num + "0");
                q.add(num + "9");
            }
        }
    }
}
