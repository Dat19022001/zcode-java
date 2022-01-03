import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class J02017 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int s=input.nextInt();
        Integer [] a= new Integer[s];
        for(int i=0;i<s;i++){
            a[i]=input.nextInt();
        }
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(a));
        while (!kiemtra(b)) {
            for (int i = 0; i < b.size()-1; i++) {
                if ((b.get(i) + b.get(i+1)) % 2 == 0) {
                    b.remove(i);
                    b.remove(i++);
                }
            }
        }

        System.out.println(b.size());
    }
    public static boolean kiemtra(ArrayList<Integer> a){
        for(int i=0;i< a.size()-1;i++){
            if((a.get(i) + a.get(i + 1))%2==0){
                return false;
            }
        }
        return true;
    }
}
