// suppose we want to store infomation in the form of key and value

import java.time.Period;
import java.util.*;

public class HashMap1 {
    public static void  main(String args[])
    {
     HashMap<Integer, String> hobj = new HashMap<>();
     
     hobj.put(1,"Savan");
     hobj.put(2,"Sumit");
     hobj.put(3,"Radha");
     hobj.put(4,"Ram");
     hobj.put(3,"Ramesh");

     String std = hobj.get(3);

     System.out.println(hobj);
     System.out.println(std);

     // check for key contains
     System.out.println(hobj.containsKey(4));

     // check for value contains
     System.out.println(hobj.containsValue("Ram"));

     //using set

     System.out.println("using the set");
     Set<Integer> keys = hobj.keySet();
     System.out.println(keys);
     

     //  iterate using loop 
     for (int i : hobj.keySet()) {

         System.out.println(hobj.get(i));
     }

     //converting all the element to Uppercase
     Set<Map.Entry<Integer,String>> entries = hobj.entrySet();

     for(Map.Entry<Integer,String> entry : entries)
     {
        entry.setValue(entry.getValue().toUpperCase());

     }
     System.out.println(hobj);

     // we replace the existing value using key
     hobj.put(2,"Sush");

     System.out.println(hobj);

     // removing element from hashmap
    Object iRet = hobj.remove(3);
    System.out.println(iRet);
    }
}
