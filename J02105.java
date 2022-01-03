import java.util.Scanner;

public class J02105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[1000][1000];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print("List(" + (i + 1) + ") = ");
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    System.out.print((j + 1) + " ");
                }
            }
            System.out.println("");
        }
    }
}
