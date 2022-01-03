import java.util.Scanner;

public class J03025 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int t=input.nextInt();
        while (t-->0) {
            String s = input.next();
            int dem = 0;
            if (s.length() % 2 == 0) {
                for (int i = 0; i < s.length() / 2; i++) {
                    if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                        dem++;
                    }
                }
                if (dem ==1)
                    System.out.println("YES");
                else System.out.println("NO");
            }
            else {
                for (int i = 0; i < s.length() / 2; i++) {
                    if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                        dem++;
                    }
                }
                if (dem >=2)
                    System.out.println("NO");
                else System.out.println("YES");
            }
        }
    }
}
