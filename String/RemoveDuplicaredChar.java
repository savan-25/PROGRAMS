// remove Duplicared character from a string

// 1> using java 8
// 2> using indexOf(..)
//  3> using character Array
// 4> using set interface method
// ip - programming
// op - poraming
import java.util.*;
public class RemoveDuplicaredChar {
   
    // approach 1
    public static void RemoveDuplicated(String str)
    {
        StringBuilder sb1 = new StringBuilder();

        str.chars().distinct().forEach(c-> sb1.append((char)c));

        System.out.println(sb1);
    }
   //approach 2
   public static void RemoveDuplicated2(String str)
   {
    StringBuilder sb2 = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);

        int idx = str.indexOf(ch,i+1);

        if(idx == -1)
        {
            sb2.append(ch);
        }

        System.out.println(sb2);
    }
   }

   //approach 3
   public static void RemoveDuplicated3(String str)
   {
    char ch[] = str.toCharArray();

    StringBuilder sb3 = new StringBuilder();

    for (int i = 0; i < ch.length; i++)
     {  
        char c = ch[i];
        boolean Repated = false;
        for (int j = i+1; j < ch.length; j++) 
        {
            if(c == ch[j])
            {
                Repated = true;
                break;
            }
        } 
        if(!Repated){
            sb3.append(c);
        } 
    }   
    System.out.println(sb3);
   }

   public static void RemoveDuplicated4(String str)
   {
     StringBuilder sb4 = new StringBuilder();

     Set<Character> set = new LinkedHashSet<>();

     for(int i = 0;i<str.length();i++)
     {
        set.add(str.charAt(i));
     }

     for(Character c :set)
     {
        sb4.append(c);
     }

     System.out.println(sb4);
   }
    public static void main(String[] args) {
        
        String str = "programming";

        RemoveDuplicated3(str);
     
       }
        
    }
    

