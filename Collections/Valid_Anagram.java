// check the given words are angrams of each other or not

import java.util.*;
class Practice
{   
    public static boolean Anagram(String str1,String str2)
    {
      
        if(str1.length() != str2.length())
        {
            return false;
        }
        for (int i = 0; i < str1.length(); i++)
        {   boolean bret = false;
            for (int j = 0; j < str2.length(); j++) 
            {
                if(str1.charAt(i) == str2.charAt(j))
                {
                  bret = true;
                  break;
                }
                
            } 
            if(!bret)
            {
                return false;
            }
        }

        return true;
    }
    public static String SortString(String str)
    {
        char ch[] = str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
    public static boolean Anagrams2(String s1,String s2)
    {
        if(s1.length() != s2.length())
        {
            return false;
        }

        s1 = SortString(s1);
        s2 = SortString(s2);

        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i) != s2.length())
            {
                 return false;
            }
        }
        return true;


    }
    public static void main(String[] args) {
        String str = "RULES";
        String str1 = "LESRT ";

        System.out.println(Anagram(str1, str1));
    }
}
