// Finding First Non-repeated Character in String 
//Without Using Collection 
// Using Collections

import java.util.HashMap;
import java.util.Map;
public class NonRepatating {

    public static void NonRepeatedChar(String str)
    {   
        char Ans ='\0';
        
        for(int i = 0;i<str.length();i++)
        {  
            boolean bRet = true;
            for(int j = 0;j<str.length();j++)
            {
                if(i != j && str.charAt(i) == str.charAt(j))
                {
                    bRet = false;
                    break;
                }

            }
            if(bRet == true)
            {
                Ans = str.charAt(i);
                break;
            }
        }
        System.out.println(Ans);
    }

    // using Collection
    public static void NonRepeatedChar1(String str)
    {
        Map<Character,Integer> hobj  = new HashMap<>();
        
        for(int i = 0;i<str.length();i++)
        {
            int val = hobj.getOrDefault(str.charAt(i),0);

            hobj.put(str.charAt(i),val+1);
        }

        for(Map.Entry<Character,Integer> it : hobj.entrySet())
        {
             if(it.getValue()==1)
             {
                System.out.println(it.getKey());
                break;
             } 
        }

    }
   public static void main(String args[])
    {
        String str = "AABCDDBE";

        NonRepeatedChar1(str);
    }
}
