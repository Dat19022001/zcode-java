package J04021;

import java.util.TreeSet;

public class IntSet {
    private int a[];

    public IntSet(int[] a) {
        this.a = a;
    }
    public IntSet intersection(IntSet b){
        TreeSet <Integer> set = new TreeSet<>();
        TreeSet <Integer> set2 = new TreeSet<>();
        for(int i = 0;i<a.length;i++){
            set.add(a[i]);
        }
        for (int i = 0;i<b.a.length;i++){
            if(set.contains(b.a[i])) {
                set2.add(b.a[i]);
            }
        }
        int c [] = new int[set2.size()];
        int j = 0;
        for(Integer i:set2){
            c[j] = i;
            j++;
        }
        IntSet res = new IntSet(c);
        return res;
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < a.length; i++) {
            res += String.valueOf(a[i]) + " ";
        }
        return res;
    }
}
