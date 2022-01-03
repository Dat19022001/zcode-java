import java.util.Scanner;

public class J01018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        while (n-->0){
            String s = input.nextLine();
            if(kiemtra(s))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
    static boolean kiemtra(String s){
        int tong =0;
        for(int i =0;i< s.length();i++){
            tong+=  s.charAt(i)-'0';
        }
        if(tong%10!=0) return false;
        for(int i =0;i< s.length()-1;i++){
            if(Math.abs((int) s.charAt(i)-(int) s.charAt(i+1))!=2)
                return false;
        }
        return true;
    }
}
