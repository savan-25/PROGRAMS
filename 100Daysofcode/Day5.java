/*
 * Day 4 coding Statement:  Write a program to identify of the a number is positive or negative

Description

Get an input number from the user and check whether it is a positive or negative number.

Input :
-10
Output : 
Negative number

Input :
0
Output :
Neither positive nor negative

Input :
15
Output : 
Positive number
 */

import java.util.Scanner;

public class Day5 {
    public static boolean CheckNum(int No)
    {
        if(No > 0 && No < Integer.MAX_VALUE)
        {
            return true;
        }
       return false;
    }
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int No = 0;


        System.out.println("Enter the Number ");
        No = sobj.nextInt();

        boolean bRet = CheckNum(No);

        if(bRet)
        {
            System.out.println("Number is Positive Number ");
        }
        else if(No == 0)
        {
            System.out.println("Neither positive nor negative");
        }
        else
        {
            System.out.println("Number is Negative ");
        }
    }
    
}
