import java.util.HashMap;
import java.util.Scanner;

public class J08012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        HashMap<Integer,Integer> dat = new HashMap<>();
        for (int i = 0;i<n-1;i++){
            int a = input.nextInt(),b = input.nextInt();
            if(dat.containsKey(a)){
                dat.put(a, dat.get(a)+1);
            }
            else {
                dat.put(a,1);
            }
            if(dat.containsKey(b)){
                dat.put(b, dat.get(b)+1);
            }
            else {
                dat.put(b,1);
            }
        }
        if (dat.containsValue(n-1)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
