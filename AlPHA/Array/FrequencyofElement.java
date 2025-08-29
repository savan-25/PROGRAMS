import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

import org.xml.sax.HandlerBase;

public class FrequencyofElement {

    // Using Hash Map
    public static void Display(int Arr[])
    {

      HashMap<Integer,Integer> hobj = new HashMap<>();

      for(int i=0;i<Arr.length;i++)
      {
        int val = hobj.getOrDefault(Arr[i], 0);

        hobj.put(Arr[i],val+1);
      }

      for(Map.Entry<Integer,Integer> itr : hobj.entrySet())
      {
         System.out.println(itr.getKey()+"\t"+itr.getValue());
      }
    }
    public static void main(String[] args) {
        
        int Arr[] = {1,2,3,4,1,3,4,5,5,6};
        int num = 10;
        
        Display(Arr);
    }
}
