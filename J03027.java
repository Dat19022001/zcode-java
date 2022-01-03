import java.util.Scanner;
import java.util.Stack;

public class J03027 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        Stack<Character> a = new Stack<>();
        a.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if(!a.empty() && a.peek() == s.charAt(i)) {
                a.pop();
            }else   a.push(s.charAt(i));
        }
        if(a.size() == 0)
            System.out.println("Empty String");
        else {
            StringBuilder res = new StringBuilder("");
            while(!a.empty()) {
                res.append(a.peek());
                a.pop();
            }
            System.out.println(res.reverse());
        }
    }
}
