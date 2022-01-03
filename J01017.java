import java.util.Scanner;

public class J01017 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = Integer.parseInt(input.nextLine());
        while (t-->0){
            boolean kiemtra = true;
            String s = input.nextLine();
            for (int i =0 ;i<s.length()-1;i++){
                if(Math.abs((int) s.charAt(i)-(int) s.charAt(i+1))!=1){
                    kiemtra = false;
                    System.out.println("NO");
                    break;
                }
            }
            if(kiemtra) System.out.println("YES");
        }
    }
}
