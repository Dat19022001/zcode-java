import java.util.Scanner;

public class J02020 {
    static int n,k, dem = 0;
    static int[] x = new int[20];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        x[0] = 0;
        Try(1);
        System.out.println("Tong cong co "+dem+" to hop");
    }
    public static void In(){
        for (int i = 1; i <= k; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println("");
    }
    public static void Try(int i){
        for( int j = x[i - 1] + 1; j <= n - k + i; j++){
            x[i] = j;
            if(i == k){
                In();
                dem ++;
            }
            else Try(i + 1);
        }
    }
}
