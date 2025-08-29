/*
 * Day 12 coding Statement:  Write a program to find Sum of digits of a number

Description
Get a number from user and then find the sum of the digits in the given number.
E.g. let the number = 341
Sum of digits is 3+4+1= 8

Input
4521
Output
12
 */

import java.util.Scanner;

public class Day12 {
    public static int  SumOfDigit(int iNo)
    {
        int iSum = 0;
        int Digit = 0;
        while(iNo > 0)
        {
            Digit = iNo % 10;
            iSum += Digit;
            iNo = iNo /10;
            
        }
        return iSum;

    }
    public static void main(String[] args) {
        int No = 0;

        Scanner sobj = new Scanner(System.in);
       
        System.out.println("Enter the Number ");
       No = sobj.nextInt();

       int iRet = SumOfDigit(No);

       System.out.println("Sum of Digits in given Number is :"+iRet);
    }
    
}
