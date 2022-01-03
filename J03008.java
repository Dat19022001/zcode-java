import java.util.Scanner;

public class J03008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while (t-- > 0){
            String str = input.nextLine();
            if (ThuanNgich(str)&& Kiemtra(str)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
    static boolean Nguyento(int n){
        if(n == 1 || n == 0){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n);i++){
            if ( n % i == 0){
                return false;
            }
        }
        return true;
    }
    static boolean ThuanNgich(String str){
        StringBuilder str1 = new StringBuilder(str);
        if (str.equals(str1.reverse().toString())){
            return true;
        }
        return false;
    }
    static boolean Kiemtra(String str){
        for (int i = 0;i<str.length();i++){
            if (!Nguyento((int) str.charAt(i) - '0')){
                return false;
            }
        }
        return true;
    }

}
