import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07008 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("DAYSO.in"));
        ArrayList<Integer> ds = new ArrayList<>();
        while (input.hasNextInt()) {
            ds.add(input.nextInt());
        }

        int n = ds.get(0);
        int[] a = new int[n];
        for (int i = 1; i < ds.size(); i++) {
            a[i-1] = ds.get(i);
        }
        ArrayList<Integer> ds1 = new ArrayList<>();
        ArrayList<String> ds2 = new ArrayList<>();
        in(a, 0, ds1, ds2);
        Collections.sort(ds2);
        for(String str : ds2)
            System.out.println(str);
    }

    static void in(int[] arr, int index, ArrayList<Integer> path, ArrayList<String> ans) {
        if(index == arr.length) {
            if(path.size() > 1 && check(path)){
                StringBuilder res = new StringBuilder();
                for (Integer integer : path) {
                    res.append(integer).append(" ");
                }
                ans.add(res.toString());
            }

        }
        else {
            in(arr, index + 1, path, ans);
            path.add(arr[index]);
            in(arr, index + 1, path, ans);
            path.remove(path.size() - 1);
        }
    }

    static boolean check(ArrayList<Integer> path) {
        for (int i = 0; i < path.size() -1; i++) {
            if(path.get(i) > path.get(i+1))
                return false;
        }
        return true;
    }
}
