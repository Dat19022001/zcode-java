import java.util.Scanner;

public class J01009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        long tong = 1;
        Long[] arr = new Long[21];
        arr[1] = 1L;

        for (int i = 2; i <= t; i++) {
            arr[i] = i * arr[i-1];
            tong+=arr[i];
        }

        System.out.println(tong);
    }
}
