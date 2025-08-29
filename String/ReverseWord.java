//Given a string s, reverse the words of the string.
/*
 Input: s=”this is an amazing program”
Output: “program amazing an is this”
 */
import java.util.*;
public class ReverseWord {
    
    public static void ReverseWord(String str)
    {   
         int left = 0;
         int right = str.length()-1;

         String temp = "";
         String ans = "";

        //  Iterate the string and keep on adding to form a word
        // Iterate the string and keep on adding to form a word

        while(left <= right)
        {
            char ch = str.charAt(left);
            if(ch != ' ')
            {
                temp +=ch;
            }else if( ch == ' ')
            {
                if(!ans.equals(""))
                {
                    ans = temp+" "+ans;
                }else
                {
                    ans = temp;
                }
                temp = "";
            }
            
        }
    }
    public static void main(String args[])
    {
        String s = "this is an amazing program";
       
        ReverseWord(s);
       

    }
    
}
