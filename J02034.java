import java.util.Scanner;

public class J02034 {
    public static void main(String[] args) {
        Scanner input= new Scanner( System.in);
        int n= input.nextInt();
        int dem=0,k=1;
        int [] a= new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        if(k<a[0]){
            dem++;
            for(int i=1;i<a[0];i++){
                System.out.println(i);
            }
        }
        for(int i=0;i<n-1;i++){
            if(a[i]+1<a[i+1]){
                dem++;
                System.out.println(a[i]+1);
                a[i]+=1;
                i--;
            }
        }
        if(dem==0) System.out.println("Excellent! ");
    }
}
