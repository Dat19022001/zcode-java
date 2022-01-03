import java.util.*;

public class J03013 {
    static boolean Small(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        if (n1 < n2)
            return true;
        if (n2 < n1)
            return false;

        for (int i = 0; i < n1; i++)
            if (s1.charAt(i) < s2.charAt(i))
                return true;
            else if (s1.charAt(i) > s2.charAt(i))
                return false;

        return false;
    }
    static String Sub(String s1,String s2){
        if(Small(s1,s2)){
            String t = s1;
            s1=s2;
            s2=t;
        }
        String s="";
        int n1 = s1.length(), n2 = s2.length();
        s1 = new StringBuilder(s1).reverse().toString();
        s2 = new StringBuilder(s2).reverse().toString();
        int nho=0;
        for (int i = 0; i < n2; i++) {
            int sub = (s1.charAt(i)-'0')-(s2.charAt(i)-'0')-nho;
            if(sub<0){
                sub+=10;
                nho=1;
            }
            else
                nho=0;
            s += (char) (sub + '0');
        }
        for (int i=n2;i<n1;i++){
            int sub= (s1.charAt(i)-'0')-nho;
            if(sub<0){
                sub+=10;
                nho=1;
            }
            else nho=0;
            s+=(char)(sub+'0');
        }
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int t= input.nextInt();
        while (t-->0){
            String a =input.next(),b=input.next();
            System.out.println(Sub(a,b));
        }
    }
}
