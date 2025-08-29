
// Write a Java Program to find Occurence of Each character in given String 
// input hello
//output h-1 e-1 l = 2 o =1
import java.util.Map;
import java.util.HashMap;
class Occurence {
    

    // This approach is Writtein by me and these is Best Approch
    public static void Occurence1(String str)
    {   
        // Creation of HashMap to Store the Key and Value
        HashMap<Character,Integer> hobj = new HashMap<>();

        for(int i = 0;i<str.length();i++)
        {   
            //check for Character already Present or its occurence
            int val = hobj.getOrDefault(str.charAt(i), 0);

            hobj.put(str.charAt(i),val+1);
        }

        // Element and it Occurence
        for(Map.Entry<Character,Integer> it : hobj.entrySet() )
        {
            System.out.print(it.getKey()+"-"+it.getValue());
            System.out.println();
        }
         //This is Another Way to Print the Output
        System.out.println(hobj);
    }
    //Another way to Write Same Logic
    public static void Occurence2(String str)
    {
        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0 ;i<str.length();i++)
        {
            if(! map.containsKey(str.charAt(i)))
            {
                 map.put(str.charAt(i),1);
            }
            else{
                int value = map.getOrDefault(str.charAt(i),0);
                map.put(str.charAt(i),value+1);
            }
        }

        for(Map.Entry<Character,Integer> it : map.entrySet() )
        {
            System.out.print(it.getKey()+"-"+it.getValue());
            System.out.println();
        }
    }
    public static void main(String args[])
    {

        String str = "Hello";

        Occurence1(str);

    }
    
}
