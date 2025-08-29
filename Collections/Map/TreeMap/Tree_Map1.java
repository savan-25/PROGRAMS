import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Tree_Map1 {
    public static void main(String[] args) 
    {

         // it gives same order as we insert
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();//(Initalcapacity,loadfactor , accessorder)
        lhm.put("india :",1);
        lhm.put("Pak   :",2);
        lhm.put("China :",3);
        lhm.put("AFG   :",4);
       System.out.println(lhm);

        // it gives sorted order of key
        TreeMap<String,Integer> thm = new TreeMap<>();//(Initalcapacity,loadfactor , accessorder)
        thm.put("india :",1);
        thm.put("Pak   :",2);
        thm.put("China :",3);
        thm.put("AFG   :",4);
       System.out.println(thm);
    }
    
}
