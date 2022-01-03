import java.math.BigInteger;
import java.util.Scanner;

public class J03033 {
    public static void main(String[] args) {
        Scanner input= new Scanner( System.in);
        int t= input.nextInt();
        input.nextLine();
        while (t-->0){
            BigInteger A=input.nextBigInteger();
            BigInteger B=input.nextBigInteger();
            System.out.println((A.multiply(B)).divide(A.gcd(B)));
        }
    }
}
