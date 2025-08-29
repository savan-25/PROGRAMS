import java.util.HashMap;
import java.util.Map;
public class HashMap2 
{   
    // Eample : Suppose we want to store information about the number of fruits in a store
      
     //Fruit                            Quantity
    /* Apple                               50
       Banana                              30 
       Oranage                             80
       Grape                               20
    
      */
    public static void main(String args[])
    {

        HashMap<String,Integer> hobj = new HashMap<>();
        hobj.put("Apple",50);
        hobj.put("Banana",30);
        hobj.put("Orange",80);
        hobj.put("Grape",20);

     System.out.println("HashMap Structure :");

     // we not directly iterato over hashmap - because the store the element in the form of key and value
     //there is way to iterate over the hashmap

     // entrySet()
     
     for(Map.Entry<String,Integer> entry : hobj.entrySet())
     {
        System.out.println(entry.getKey() + " = "+entry.getValue());
     }

    }
    
}




/*
 * ava HashMap Internal Working :

A HashMap in Java is a part of the Java Collections Framework and is used to store data in key-value pairs. The internal working of a HashMap involves several core concepts such as hashing, buckets, and handling collisions. Below, I'll break down these concepts and explain how they contribute to the functionality of a HashMap.

1. Hashing
The primary concept in a HashMap is hashing, where the hash function is used to convert the large keys into smaller indices that represent indices in the array. A good hash function aims to distribute keys uniformly across the buckets.

2. Array of Buckets
A HashMap internally has an array of buckets, where each bucket is used to store entries (nodes containing key-value pairs). The size of the array grows dynamically as the number of entries in the HashMap increases.

3. Structure of a Bucket
Each bucket contains linked entries. Before Java 8, each bucket was structured as a linked list, but from Java 8 onwards, when the number of items in a bucket reaches a certain threshold, that bucket's linked list is replaced by a balanced tree, which improves the worst-case performance from O(n) to O(log n).

4. Putting an Entry
When the put(key, value) method is used:
The HashMap computes the hash of the key.
This hash is then used to find the bucket where the entry should be stored.
If the bucket is found to have other entries (collision scenario), a new entry node will be added either to the linked list or tree (depending on the number of entries).

5. Getting an Entry
When the get(key) method is called:
The HashMap again computes the hash of the key.
It uses this hash to find the appropriate bucket.
If the bucket contains multiple entries (due to previous collisions), the HashMap will either scan through a linked list or tree to find the matching key.

6. Handling Collisions
Collisions occur when multiple keys are hashed to the same bucket index. Initially, as mentioned, collisions are handled using linked lists. However, if the bucket size grows beyond a certain threshold and the overall treeify threshold is reached, the linked list is converted into a balanced tree to maintain efficient searching time.

7. Resizing
The HashMap automatically resizes itself when the number of entries in the map exceeds a certain threshold defined as the load factor multiplied by the current capacity. Resizing involves creating a new array of buckets larger than the original and then rehashing all existing keys to new bucket locations.

8. Load Factor
The load factor is a measure that decides when to increase the capacity of the HashMap to maintain the get/put operation's efficiency. The default load factor is 0.75, which is a good trade-off between time and space costs.
 */