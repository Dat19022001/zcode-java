import java.util.Scanner;

public class DSATest11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = Integer.parseInt(input.nextLine());
        while (t-->0){
            boolean kiemtra=true;
            String s =input.nextLine();
            for (int i =0 ; i<s.length();i++){
                if(s.charAt(i)!='1'&&s.charAt(i)!='0'&&s.charAt(i)!='2'){
                    kiemtra= false;
                    break;
                }
            }
            if(!kiemtra) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
