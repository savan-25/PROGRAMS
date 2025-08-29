import java.util.HashMap;
import java.util.*;
public class Map1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
       
        map.put(2, "dev");
        map.put(3, "viraj");
        map.put(1, "Sava");
        map.put(1, "savan");// override

        System.out.println(map);

        String s  = map.get(21);

        System.out.println(map.containsKey(2));

     
        for(int i : map.keySet())
        {
            System.out.println(map.get(i));
        }
        
        // dono bhi chahiy key and values

       Set<Map.Entry<Integer,String>> entries = map.entrySet();

       for( Map.Entry<Integer,String> entry: entries)
       { 
            System.out.println(entry.getKey() + " : "+entry.getValue());
       }

       System.out.println(map);
    }
}

/*
 * In Java, Map Interface is present in the java.util package represents a mapping between a key and a value. 
 * Java Map interface is not a subtype of the Collection interface.
 *  Therefore it behaves a bit differently from the rest of the collection types.

No Duplicates in Keys: Ensures that keys are unique. However, values can be duplicated.
Null Handling: Allows one null key in implementations like HashMap and LinkedHashMap and allows multiple null values in most implementations.
Thread-Safe Alternatives: Use ConcurrentHashMap for thread-safe operations also, wrap an existing Map using Collections.synchronizedMap() for synchronized access.
The Map data structure in Java is implemented by two interfaces, the Map Interface and the SortedMap Interface. Three primary classes implement these interfaces HashMap, TreeMap, and LinkedHashMa
 */
