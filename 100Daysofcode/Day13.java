/*
 * Day 13 coding Statement:  Write a program to find Sum of N natural numbers

Description

Get the input from the user for the value of n and then find the sum of first n natural numbers.
e.g. let the n value = 5
then first 5 natural numbers are 1,2,3,4,5 for which we need to find the sum
Therefore sum of first 5 natural numbers is 1+2+3+4+5 = 15
Input
4
Output
10
 */

import java.util.Scanner;

public class Day13 {
    public static int SumofElement(int iNo)
    {
        if(iNo == 0)
        {
            return 0;
        }
        return iNo + SumofElement(iNo-1);
    }
    public static void main(String[] args) {
        int iNo = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number :");
        iNo = sobj.nextInt();

        int iRet = SumofElement(iNo);

        System.out.println("Sum of First"+iNo+"digit is "+iRet);
    }
    
}
