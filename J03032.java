import java.util.Scanner;

public class J03032 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while (t-->0){
            String s =input.nextLine();
            String[] tu = s.split(" ");
            for (String i : tu) {
                StringBuilder stringBuilder = new StringBuilder(i);
                System.out.print(stringBuilder.reverse()+" ");
            }
            System.out.println();
        }
    }
}
