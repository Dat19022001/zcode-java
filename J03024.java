import java.util.Scanner;

public class J03024 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = Integer.parseInt(input.nextLine());
        while (t-- >0) {
            String s = input.nextLine();
            System.out.println(souuthe(s));
        }
    }

    static String souuthe(String s) {
        int c = 0, l = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                if((int) (s.charAt(i) - '0') % 2 ==0)
                    c++;
                else l++;
            }else
                return "INVALID";
        }
        int tong = c+l;
        if((tong % 2 == 0 && c > l) || (tong%2 == 1 && l > c))
            return "YES";
        return "NO";
    }
}
