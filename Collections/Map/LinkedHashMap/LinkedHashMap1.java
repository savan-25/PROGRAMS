/*
    keys are insertion ordered
    Linked HashMap extends the HashMap
 */
// LinkedHashMap<k,v> hm = new LinkedHashMap<>()
/*
   put
   get
   rename
   size
   isEmpty
   keySet

   are same as HashMap with same time complexity
   *****jab hame insertion order maintain karna hai tab ise use kare******
 */

import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;

public class LinkedHashMap1 {
    public static void main(String[] args) 
    {    

        // it gives same order as we insert
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();//(Initalcapacity,loadfactor , accessorder)
        lhm.put("india :",1);
        lhm.put("Pak   :",2);
        lhm.put("China :",3);
        lhm.put("AFG   :",4);
       System.out.println(lhm);
        // it does not maintain any order
        HashMap<String,Integer> lhm1= new HashMap<>();
        lhm1.put("india :",1);
        lhm1.put("Pak",2);
        lhm1.put("China",3);
        lhm1.put("AFG",4);
       
        System.out.println(lhm1);

        for(Map.Entry<String,Integer> entry : lhm.entrySet())
        {
            System.out.println(entry.getKey() + " " +entry.getValue());
        }
     

    }
    
}

// for replacing the existing data we use put
// if we want to update only when given value is absent
// if we use access order true then latest used element goes to the end -> beacuse it follows LRU
//cashing - jab aap sab kuch disk me store karne lage to delete konsa kare - > LRU
