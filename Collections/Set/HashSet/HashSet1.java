import java.util.Set;
import java.util.HashSet;


public class HashSet1 {
    public static void main(String[] args) {
        Set<String> sobj = new HashSet<>();

        sobj.add("Apple");
        sobj.add("Banana");
        sobj.add("Apple");//Duplicate

        System.out.println(sobj);
        /*
         * Duplicate "Apple" is not added again.

         Order is not guaranteed.
         */

    }

    
}
