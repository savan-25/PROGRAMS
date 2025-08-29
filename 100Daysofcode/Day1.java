
/*Day 1 coding Statement: Write a program to identify if the character is a vowel or consonant. */
/*
 * Input  A Output  Vowel

Input
m
Output
Consonant

Input
3
Output
Invalid Input
 */


import java.util.Scanner;

public class Day1 {
    
    public static boolean CheckVowel(char ch)
    {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u')
        {
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
      Scanner sobj = new Scanner(System.in);

       System.out.println("Enter the Character " );
       char ch = sobj.next().toLowerCase().charAt(0);
        
       boolean bRet = CheckVowel(ch);
      
       if(bRet)
       {
        System.out.println("Given Character is Vowel");
       }
       else if(ch < 'a' || ch > 'z')
       {
           System.out.println("Inavalid Character");
       }
       else
       {
        System.out.println("given character is Consonent");
       }
    }
    
}
