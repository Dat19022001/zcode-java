import java.util.Scanner;

public class J01005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            int n= sc.nextInt(),h=sc.nextInt();
            for (int i=1;i<n;i++){
                double d = h*(Math.sqrt((double) i/n));
                System.out.printf("%.6f ",d);
            }
            System.out.println();
        }
    }
}
