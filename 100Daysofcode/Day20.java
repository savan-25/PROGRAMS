/*
 * Day 21 coding Statement : Write a program to identify if the number is Palindrome or not

Description

Get a number as input from the user and check whether that number is a Palindrome or not.

Input
121

Output
Palindrome

Input
34

Output
Not a Palindrome
 */

import java.util.Scanner;

public class Day20 {
    
    public static boolean CheckPali(int Num)
    {
        int temp = Num ;
        int rev = 0,Digit = 0,val = 0;

        while(temp > 0)
        {
            Digit = temp % 10;
            rev = rev*10+Digit;
            temp = temp / 10;
        }
        
        return rev == Num;
    }
    public static void main(String args[])
    {
        int No = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number ");
        No = sobj.nextInt();

        bRet = CheckPali(No);

        if(bRet)
        {
            System.out.println("Given number is Palindrome");
        }
        else
        {
            System.out.println("Given Number is Not Palindrome");
        }
    }
    
}
