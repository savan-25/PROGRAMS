/*
 * Day 15 coding Statement : Write a program to identify if the number is Strong number or not

Description
Get a number as input from user and then check whether that number is a strong number or not. A number is said to be strong number if the sum of the factorial of each digit in the number is same as that of the number.
E.g. let the number be 145

Here 1! + 4! + 5! is 1 + 24 + 120 which is equal to 145 itself.
Input
121
Output
Not a strong number
Input
2
Output
Strong number
 */

import java.util.Scanner;

public class Day15 {
     
    public static int iFact(int No)
    {
        if(No == 1)
        {
            return 1;
        }

        return No * iFact(No-1);
    }
    public static boolean CheckStrong(int No)
    {   
        int temp = No;
        int Digit = 0;
        int iSum = 0;
        while(No > 0)
        {
            Digit = No % 10;
            iSum += iFact(Digit);
            No = No / 10;
        }

        if(iSum == temp )
        {
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        int No = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number ");
        No = sobj.nextInt();

        boolean bRet = CheckStrong(No);

        if(bRet)
        {
            System.out.println("Strong Number ");
        }
        else
        {
            System.out.println("Not a Strong Number ");
        }
    }
}
