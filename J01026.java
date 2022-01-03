import java.util.Scanner;

public class J01026 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- >0) {
            int num = input.nextInt();
            if((int) Math.sqrt(num) * (int) Math.sqrt(num) == num){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
