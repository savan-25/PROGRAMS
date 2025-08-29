/* Day 23 coding Statement : Write a program to Replace all 0’s with 1 in a given integer

Description

Get a number as input from the user and find the zeros present in that number.

Then convert the zeros into one and then print it.

Input
310020

Output
311121*/

import java.util.Scanner;

public class Day23 {
    public static String Replace(int No)
    {
        String str = "";
         
        // Edge Case : when Number is 0
        if(No == 0)
        {
            return "1";
        }
        while(No > 0)
        {
           int Digit = No % 10;
           if(Digit == 0)
           {
            str ="1" + str;
           } 
            else
            {
                str =Digit + str;
            } ;
           No = No /10;
        }
        
        return str;
    }
    // Approach : Using String Replacement 
    public static String ReplaceWithOne(int iNo)
    {
        String str = Integer.toString(iNo); // Convert number to String 
        
        str = str.replace('0','1'); // Replace all '0' with '1'
        return str;
    }
    public static void main(String[] args) {
        int No = 0 ;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number :");
        No = sobj.nextInt();

        String iRet = ReplaceWithOne(No);
        System.out.println(iRet);

    }
}
