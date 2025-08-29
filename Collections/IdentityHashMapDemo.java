/*
     It is exactly same as HashMap except the following differences:  
1. In the case of HashMap JVM will always use ".equals()"method to identify 
duplicate keys, which is meant for content comparision. 
2. But in the case of IdentityHashMap JVM will use== (double equal operator) to 
identify duplicate keys, which is meant for reference comparision.



if(node.key.equals(Key)){
// key matches ,rerurn the value
   return node.value;}
 */

 import java.util.Map;
 import java.util.HashMap;
public class IdentityHashMapDemo {
    public static void main(String[] args) {
     
     String Key1 = new String("Key");
     String Key2 = new String("Key");

     Map<String,Integer> map = new HashMap<>();

     map.put(Key1,1);//key ,1
     map.put(Key2,2);// key , 2

     // checking equlas
    

     System.out.println(Key1.equals(Key2));

     System.out.println(map);
    }
}
