import java.util.Scanner;

public class J03026 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int t = Integer.parseInt(input.nextLine());
        while (t -- >0) {
            String s1 = input.nextLine();
            String s2 = input.nextLine();
            System.out.println(kiemtra(s1, s2));
        }
    }

    static int kiemtra(String s1, String s2) {
        if(s1.equals(s2))
            return -1;
        return s1.length() > s2.length() ? s1.length() : s2.length();
    }
}
