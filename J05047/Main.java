package J05047;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<dsChietkhau> ds = new ArrayList<>();
        SortedMap<String,Integer> ma = new TreeMap<>();
        int t = Integer.parseInt(input.nextLine());
        for(int i = 0;i<t;i++){
            dsChietkhau a = new dsChietkhau(input.nextLine(), Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine()));
            if(!ma.containsKey(a.getName())){
                ma.put(a.getName(),1);
            }
            else ma.put(a.getName(),ma.get(a.getName())+1);
            String id =a.getName()+String.format("%02d",ma.get(a.getName()));
            a.setId(id);
            ds.add(a);
        }
        Collections.sort(ds);
        for(dsChietkhau i:ds){
            System.out.println(i);
        }
    }
}
