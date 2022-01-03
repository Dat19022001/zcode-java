import java.util.*;

public class J01013 {
    public static boolean[] isPrime = new boolean[2000006];
    public static int[] arrayPrime = new int[200005];

    public static void NguyenTo(){
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        int k = 0;
        for(int i = 2;i <=(int)Math.sqrt(2000005);i++){
            if(isPrime[i]){
                arrayPrime[k] = i;
                k++;
                for(int j = i * i;j <= 2000005;j += i){
                    isPrime[j] = false;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        NguyenTo();
        long max = 0;
        for (int i = 0; i < n; i++) {
            if(isPrime[arr[i]])
                max+=arr[i];
            else{
                int k = 0;
                while(arr[i] != 1){
                    while(arr[i] % arrayPrime[k] == 0) {
                        max+=arrayPrime[k];
                        arr[i]/=arrayPrime[k];
                    }

                    if(isPrime[arr[i]]) {
                        max+=arr[i];
                        break;
                    }
                    k++;
                }
            }
        }
        System.out.println(max);
        sc.close();
    }
}
