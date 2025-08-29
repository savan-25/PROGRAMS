import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        Set<Integer> ts = new TreeSet<>();
        
        ts.add(5);
        ts.add(1);
        ts.add(3);
        ts.add(0);

        System.out.println(ts); //[0,1,3,5]

        /*
         * Sorted in ascending order.

         Uses natural ordering or a custom comparator.
         */
    }
    
}
