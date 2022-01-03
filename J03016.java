import java.util.Scanner;

public class J03016 {
    static Scanner input= new Scanner(System.in);
    static String s ;
    static void chiahet11(){
        long tong1=0,tong2=0;
        for(int  i=0;i<s.length();i+=2) {
            tong1 += s.charAt(i) - '0';
        }
        for(int i=1;i<s.length();i+=2){
            tong2+=s.charAt(i)-'0';
        }
        if((tong1-tong2)%11==0){
            System.out.println(1);
        }
        else System.out.println(0);
    }

    public static void main(String[] args) {
        int t=input.nextInt();
        while (t-->0){
            s=input.next();
            chiahet11();
        }
    }
}
