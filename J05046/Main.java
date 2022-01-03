package J05046;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =Integer.parseInt(input.nextLine());
        ArrayList<kho> ds = new ArrayList<>();
        for(int i =0;i< n;i++){
            ds.add(new kho(input.nextLine(),Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine())));
        }
        SortedMap<String,Integer> ma = new TreeMap<>();
        for(kho i:ds){
            if(!ma.containsKey(i.getName())){
                ma.put(i.getName(),1);
            }
            else ma.put(i.getName(),ma.get(i.getName())+1);
            String id = i.getName()+String.format("%02d",ma.get(i.getName()));
            System.out.print(id+" ");
            System.out.println(i);
        }
    }
}
