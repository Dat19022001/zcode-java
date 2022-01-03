import java.math.BigInteger;
import java.util.Scanner;

public class J03039 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-->0){
            BigInteger a = input.nextBigInteger();
            BigInteger b = input.nextBigInteger();
            if(a.mod(b).equals(BigInteger.ZERO)||b.mod(a).equals(BigInteger.ZERO)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
