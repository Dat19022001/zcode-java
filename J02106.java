import java.util.Scanner;

public class J02106 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int dem = 0;
            for (int j = 0; j < 3; j++) {
                int a = input.nextInt();
                if(a == 1) dem++;
                else dem--;
            }
            if (dem > 0) count++;
        }

        System.out.println(count);
    }
}
