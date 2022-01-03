import java.util.Scanner;

public class J01010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = Integer.parseInt(input.nextLine());
        while (t-- > 0) {
            String n = input.nextLine();
            System.out.println(catdoi(n));
        }
    }

    static String catdoi(String num) {
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            if(num.charAt(i) == '0' || num.charAt(i) == '8' || num.charAt(i) == '9')
                a.append('0');
            else if(num.charAt(i) == '1')
                a.append('1');
            else return "INVALID";
        }
        if(Long.parseLong(a.toString()) == 0L)
            return "INVALID";
        return String.valueOf(Long.parseLong(a.toString()));
    }
}
