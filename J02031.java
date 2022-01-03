import java.util.Scanner;

public class J02031 {
    public static void main(String[] args) {
        int[] a = new int[100];
        int [] [] b= new int[100][100];
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (int i = 0; i < n ; i++) {
            a[i] = input.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++)
                if (a[j] < a[min])
                    min = j;
            int c = a[min];
            a[min] = a[i];
            a[i] = c;


            if (n >= 0) System.arraycopy(a, 0, b[i + 1], 0, n);

        }
        for(int i=n-1;i>=1;i--){
            System.out.print("Buoc "+i+": ");
            for(int j=0;j<n;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

    }
}
