import java.util.Scanner;
import java.util.Stack;

public class J08020 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0){
            String s = input.next();
            System.out.println(kiemtra(s));
        }
    }
    static String kiemtra(String s){
        //khai bao stack;
        Stack<Character> dat = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if (s.charAt(i)=='(' || s.charAt(i)=='{'||s.charAt(i) =='['){
                dat.push(s.charAt(i));
            }
            else {
                if (dat.empty()){
                    return "NO";
                }
                char c = dat.peek();
                if((s.charAt(i)==')' && c =='(') || (s.charAt(i)=='}'&& c=='{') ||(s.charAt(i)==']'&& c =='[')){
                    dat.pop();
                }
                else {
                    return "NO";
                }
            }
        }
        if(dat.empty()){
            return "YES";
        }
        else {
            return "NO";
        }
    }
}
