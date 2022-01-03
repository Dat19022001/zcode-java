import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class J03040 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- >0) {
            String str = input.next();
            System.out.println(solution(str.substring(5)));
        }
    }

    static String solution(String s) {
        String str = s.substring(0,3) + s.substring(4);
        if(increArr(str))
            return "YES";
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        Set<Character> set = new HashSet<>();
        for (int j = 0; j < 3; j++) {
            set1.add(str.charAt(j));
            set.add(str.charAt(j));
        }

        for (int j = 3; j < str.length(); j++) {
            set2.add(str.charAt(j));
            set.add(str.charAt(j));
        }

        if(set1.size() == 1 && set2.size() == 1)
            return "YES";
        if(set.size() == 1 || (set.size() == 2 && set.contains('6') && set.contains('8')))
            return "YES";
        return "NO";
    }

    static boolean increArr(String str) {
        for (int i = 1; i < str.length(); i++) {
            if((int) str.charAt(i) != (int) (str.charAt(i-1) + 1))
                return false;
        }
        return true;
    }
}
