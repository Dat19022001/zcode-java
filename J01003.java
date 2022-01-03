import java.util.Scanner;

public class J01003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(),b = input.nextInt();
        if( a== 0){
            if(b == 0)
            System.out.println("VSN");
            else {
                System.out.println("VN");
            }
        }
        else{
             double x = (float) -b/(a);
            System.out.printf("%.2f",x);
        }
    }
}
