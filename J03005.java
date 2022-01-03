
import java.util.Scanner;

public class J03005 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int t= input.nextInt();
        input.nextLine();
        while (t-->0){
            String s1 = input.nextLine().toLowerCase().trim();
            StringBuilder s2= new StringBuilder(s1);
            for(int i=0;i<s2.length();i++){
                if(s2.charAt(i)==' '&&s2.charAt(i+1)==' '){
                    s2.deleteCharAt(i);
                    i--;
                }
            }
            String ho="";
            for(int i=0;i<s2.length();i++){
                if(s2.charAt(i)==' '){
                    ho=s2.substring(0,i).toUpperCase();
                    s2= new StringBuilder(s2.substring(i+1));
                    break;
                }
            }
            String a= new String(s2);
            char [] Char=a.toCharArray();
            boolean d= true;
            for(int i=0;i<a.length();i++){
                if(Character.isLetter(Char[i])){
                    if(d){
                        Char[i]=Character.toUpperCase(Char[i]);
                        d=false;
                    }
                }
                else {
                    d=true;
                }
            }
            a=String.valueOf(Char);
            System.out.println(a+", "+ho);
        }
    }
}
