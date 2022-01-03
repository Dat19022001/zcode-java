import java.util.ArrayList;
import java.util.Scanner;

public class J03010 {
    static ArrayList<String> a = new ArrayList<String>();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while(t-- >0) {
            String str = input.nextLine().toLowerCase().trim();
            convert(str);
        }
        for (int i = 0; i < a.size(); i++) {
            int dem = 0;
            for (int j = 0; j <= i; j++) {
                if(a.get(i).equals(a.get(j))) dem++;
            }
            if(dem == 1) {
                System.out.println(a.get(i) + "@ptit.edu.vn");
            }else {
                System.out.println(a.get(i) + dem+ "@ptit.edu.vn");
            }
        }
        input.close();
    }

    public static void convert(String str) {
        String res = "";
        int n = str.length() - 1;
        while(str.charAt(n) != ' '){
            res+=str.charAt(n);
            n--;
        }
        String test = "";
        for (int i = res.length() - 1; i >=0; i--) {
            test += res.charAt(i);
        }
        test+=str.charAt(0);
        for (int i = 1; i < n; i++) {
            if(str.charAt(i) != ' ' && str.charAt(i-1) == ' ') {
                test += str.charAt(i);
            }
        }
        a.add(test);
    }
}
