import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class J07003 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("DATA.in"));
        while (input.hasNext()) {
            BigInteger n = new BigInteger(input.next());
            BigInteger kiemtra = BigInteger.valueOf(10l);
            while (n.compareTo(kiemtra) != -1) {
                String a = n.toString();
                int midLen = (int) (a.length()/2);
                StringBuilder b = new StringBuilder();
                for (int i = 0; i < midLen; i++) {
                    b.append(a.charAt(i));
                }
                StringBuilder c = new StringBuilder();
                for (int i = midLen; i < a.length(); i++) {
                    c.append(a.charAt(i));
                }
                BigInteger n1 = new BigInteger(b.toString());
                BigInteger n2 = new BigInteger(c.toString());
                n = n1.add(n2);
                System.out.println(n);
            }
        }
    }
}
