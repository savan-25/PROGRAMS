// Java Program to Check Whether an Alphabet is Vowel or Consonant

import java.util.Scanner;

public class Program1 {

    public static boolean CharCheck(char ch)
    {   
        
        boolean bRet = false;

        if( ch == 'a' || ch == 'e'|| ch == 'i' ||  ch == 'o'|| ch == 'u')
        {
            bRet = true;
        }

        return bRet;
    }

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        char ch = '\0';

        System.out.println("Enter the Character :");
        ch = sobj.next().toLowerCase().charAt(0);
        
        boolean bRet = CharCheck(ch);
        if(bRet)
        {
            System.out.println("given Character is vowel");
        }
        else
        {
            System.out.println("given character is consonent");
        }



    }
}
