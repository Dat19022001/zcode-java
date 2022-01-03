import java.util.Scanner;

public class J01001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt(), n = input.nextInt();
        if (m <= 0 || n <= 0){
            System.out.println(0);
        }
        else {
            long cv = (m + n)*2 ;
            long s = m*n;
            System.out.println(cv+" "+s);
        }

    }

}
