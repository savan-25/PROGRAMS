/*Day 33 coding Statement : Write a Program to check if String is a palindrome or not

Description

Get an input string from the user and then check whether it is a palindrome string or not.

Input
noon

Output
Palindrome

Input
Talent
Output

Not a Palindrome

 */

import java.util.Scanner;

public class Day33 {
    public static boolean CheckPali(String str)
    {
        char ch[] = str.toCharArray();

        int start = 0;
        int end = str.length()-1;
           
        boolean bRet = true;;
        while(start < end)
        {
          if(ch[start] != ch[end])
          {
            bRet = false;
            break;
          }
          start++;
          end--;

        }
        return bRet;
        
    }
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = sobj.nextLine();
        boolean bRet = CheckPali(str);

        if(bRet)
        {
            System.out.println("Strin is Palindrome");
        }
        else
        {
            System.out.println("String is not Palindrome");
        }
    }
}
