// Concurrent hash map implements concurrent map   -> extend map

//map divides in 16 segments -> 16 hashmap 


//1.provides thread safe operations without locking the entire map
//2.Allows Multiple thread to operate concurrently by dividing the map into segments
//3.Supports multiple operations like putifAbsent(),replace() and remove()
//4. the default concurrency level of Concurrrent hash Map is 16
// 5. Inserting null object is not Possible in concurrentHashMap as Key or Value 

// Java Program to demosntrates the 
// working of ConcurrentHashMap
import java.util.concurrent.ConcurrentHashMap;
public class Concurrent_HashMap1 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Adding elements to the map
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        System.out.println("Map size: " + map.size());

        // Getting values from the map
        System.out.println("Value of A: " + map.get("A"));

        // Removing elements from the map
        map.remove("B");
        System.out.println("After removal map size is: " + map.size());
    }
}                                              