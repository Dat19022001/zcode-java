import java.util.Scanner;

public class J03021 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while (t-- > 0) {
            String s = input.nextLine().toUpperCase();
            StringBuilder s2 = new StringBuilder("");
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'A' || s.charAt(i) == 'B' || s.charAt(i) == 'C')
                    s2.append('2');
                if (s.charAt(i) == 'D' || s.charAt(i) == 'E' || s.charAt(i) == 'F')
                    s2.append('3');
                if (s.charAt(i) == 'H' || s.charAt(i) == 'G' || s.charAt(i) == 'I')
                    s2.append('4');
                if (s.charAt(i) == 'M' || s.charAt(i) == 'N' || s.charAt(i) == 'O')
                    s2.append('6');
                if (s.charAt(i) == 'J' || s.charAt(i) == 'K' || s.charAt(i) == 'L')
                    s2.append('5');
                if (s.charAt(i) == 'P' || s.charAt(i) == 'Q' || s.charAt(i) == 'R' || s.charAt(i) == 'S')
                    s2.append('7');
                if (s.charAt(i) == 'T' || s.charAt(i) == 'U' || s.charAt(i) == 'V')
                    s2.append('8');
                if (s.charAt(i) == 'W' || s.charAt(i) == 'X' || s.charAt(i) == 'Y' || s.charAt(i) == 'Z')
                    s2.append('9');
            }
            String s4 = s2.toString();
            String s3 = s2.reverse().toString();
            if (s4.equals(s3)) {
                System.out.println("YES");
            } else System.out.println("NO");
        }
    }
}
