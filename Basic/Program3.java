// Java Program to Find the Frequency of Character in a String

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

class Program3
{
    public static void FreChar(String str)
    {
        HashMap<Character,Integer> hobj = new HashMap<>();
         int val = 0;
            char key = '\0';
    
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
 
             val = hobj.getOrDefault(ch,0);
            
            hobj.put(ch, val+1);
        }

        for(Map.Entry<Character,Integer> itr : hobj.entrySet())
        {
            if(itr.getValue() > val)
            {   
                key = itr.getKey();
                val = itr.getValue();
            }

        }
        System.out.println(key+" "+val);
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        FreChar(str);
        
    }
}