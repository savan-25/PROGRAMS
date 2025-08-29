/*
 * Day 17 coding Statement : Write a program to find the Factors of a number

Description

Get an input from the user and find the factors of the number.

Input
4

Output
1,2,4  
 */

import java.util.Scanner;

public class Day17 {
    public static void Factorial(int No)
    {
        for(int i=1;i<=No;i++)
        {
            if(No%i == 0 )
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String args[])
    {
        int No = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number");
        No = sobj.nextInt();

        Factorial(No);
    }
}
