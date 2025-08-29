
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        Set<String> lhs = new LinkedHashSet<>();

        lhs.add("C");
        lhs.add("A");
        lhs.add("B");

        System.out.print(lhs); //[c,a,b]

        //Maintains insertion order.
        
        
    }

    
}
