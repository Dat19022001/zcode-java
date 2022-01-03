import java.util.Scanner;

public class J03007 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while (t-->0){
            String str = in.nextLine();
            if (kiemtra(str)&& thuanngich(str)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
    static boolean kiemtra(String str){
        long sum = 0;
        for (int i=0;i<str.length();i++){
            sum += (int)str.charAt(i)-'0';
        }
        return str.charAt(0) == '8' && str.charAt(str.length() - 1) == '8' && sum % 10 == 0;
    }
    static boolean thuanngich(String str){
        StringBuilder str1 = new StringBuilder(str);
        if(str.equals(str1.reverse().toString())){
            return true;
        }
        else {
            return false;
        }
    }
}
