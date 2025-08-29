//1.	Write a program to check the given alphabet is Vowel or Consonent.

import java.util.Scanner;

public class String1 {
    static boolean CheakVowel_Consonent(char ch)
    {   
        boolean bRet = false;
        ch = Character.toLowerCase(ch);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            bRet = true;
        }
        else
        {
            bRet = false;
        }
        return bRet;

    }
    public static void main(String args[])
    {  
       Scanner sobj = new Scanner(System.in);
       char ch = '\0';

       System.out.println("Enter the Alphabet");
       ch = sobj.next().charAt(0);

       boolean bRet = CheakVowel_Consonent(ch);

       if( bRet == true)
       {
        System.out.println("given Character is Vowel");
       }
       else
       {
        System.out.println("given Character is Consonent");
       }

    }
    
}
