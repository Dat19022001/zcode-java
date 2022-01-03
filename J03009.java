import java.util.Scanner;
import java.util.TreeSet;

public class J03009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = Integer.parseInt(input.nextLine());

        while(t-- >0) {
            String[] s = input.nextLine().split(" ");
            String[] s1 = input.nextLine().split(" ");
            TreeSet<String> mySet1 = new TreeSet<>();
            TreeSet<String> mySet2 = new TreeSet<>();
            for (int i = 0; i < s.length; i++) {
                mySet1.add(s[i]);
            }

            for (int i = 0; i < s1.length; i++) {
                mySet2.add(s1[i]);
            }

            for (String ms : mySet1) {
                if(mySet2.contains(ms) == false)
                    System.out.print(ms + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
