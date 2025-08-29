import java.util.*;
public class LRU_Cache <K,V> extends LinkedHashMap<K,V>
{  
     private int capacity;

     public LRU_Cache(int capacity)
     {
        super(capacity,0.75f,true);
        this.capacity = capacity;
     }
     protected boolean removeEldestEntry(Map.Entry<K,V> eldest) //it is method
     {
        // jab size bdh jayegi capacity se tab
        return size() > capacity;
     }
    public static void main(String[] args) {

        LRU_Cache<String,Integer> studentMap = new LRU_Cache<>(3);
        studentMap.put("Savan",99);
        studentMap.put("n",90);
        studentMap.put("S",94);
        studentMap.put("Sav",59);

        System.out.println(studentMap);
        // 3 entries ; jasi hi 4th entry aaygi least reacently used etry delete ho jayegi
    }
    
}
