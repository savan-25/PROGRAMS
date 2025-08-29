
import java.util.*;
import java.io.*;
class tcs
{
    public static void main(String[] args) throws IOException 
    {
       InputStreamReader ip = new InputStreamReader(System.in);

       BufferedReader br =  new BufferedReader(ip);
       
       System.out.print("Enter the String : ");
       String str = br.readLine();

       LinkedHashMap<Character,Integer> hobj = new LinkedHashMap<>();

       //Count of Occurence of each Character
       for(char c : str.toCharArray())
       {
        hobj.put(c,hobj.getOrDefault(c,0)+1);
       }
       
       if(str.isEmpty())
       {
        System.out.println("NONE");
        return;
       }
      

       Character firstNonRepeating = null;
       Character mostFrequentChar = null;
       int highestFrequency = 0;

       // Determining HighestFrequency
       for(Map.Entry<Character,Integer> itr : hobj.entrySet())
       {
          highestFrequency = Math.max(highestFrequency, itr.getValue());
       }

       // identifying the first non-repating character
       for(Map.Entry<Character,Integer> itr : hobj.entrySet())
       {
        if(itr.getValue() == 1)
        {
            firstNonRepeating = itr.getKey();
            break;
        }
       }
       // identify the most frequent repeating character
       for(Map.Entry<Character,Integer> itr : hobj.entrySet())
       {
        if(itr.getValue() == highestFrequency)
        {
            mostFrequentChar = itr.getKey();
            break;
        }
       }

       if(firstNonRepeating != null)
       {
        System.out.println(firstNonRepeating);
       }else
       {
        System.out.println("NONE");
       }

       if(mostFrequentChar != null)
       {
        System.out.println(mostFrequentChar);
       }
    }
}