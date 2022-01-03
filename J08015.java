import java.util.HashMap;
import java.util.Scanner;

public class J08015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int [] arr = new int[100000];
        while (t-->0){
            //khai bao hasmap
            HashMap<Integer,Integer> dat = new HashMap<>();
            int n = input.nextInt(), k = input.nextInt();
            for(int i = 0;i < n; i++){
                arr[i] = input.nextInt();
                if(dat.containsKey(arr[i])){
                    dat.put(arr[i],dat.get(arr[i])+1);
                }
                else{
                    dat.put(arr[i],1);
                }
            }
            long count = 0;
            for(int i = 0;i<n;i++){
                if(dat.containsKey(k-arr[i])){
                    count += dat.get(k-arr[i]);
                }
                if(k -arr[i] == arr[i]){
                    count --;
                }
            }
            System.out.println(count/2);

        }
    }
}
