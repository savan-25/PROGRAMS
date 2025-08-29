/*
 Day 9 coding Statement : Write a program to find Number of digits in an integer

Description
Take an integer as the input from the user and then calculate the number of digits in the given input and print it as the output.
Input
3241
Output
4

Input
6
Output
1
 */


 /*Steps to solve the problem
  * 1.take the number as input
    2. if we divide any number by 10 then we get reminder as last digit
    3. if we use the % Operator then we get the reminder
    4. if we use the / Operator then we get the quotient 
    
  */

import java.util.Scanner;
public class Day9 {
    public static int DigitCount(int No1)
    {
        int iCount = 0;
        int Digit = 0;

        while(No1 > 0)
        {
            Digit = No1 % 10;
            iCount++;
             No1 = No1 /10;
        }
        return iCount;
    }
    public static void main(String args[])
    {  
        Scanner sobj = new Scanner(System.in);
        int No1 = 0;
        System.out.println("Enter the Number : ");
        No1 = sobj.nextInt();

        int iRet = DigitCount(No1);

        System.out.println("Count of digit is : "+iRet);
    }
}
