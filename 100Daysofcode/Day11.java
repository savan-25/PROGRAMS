/* Day 11 coding Statement:  Write a program to find Fibonacci series up to n

Description
Fibonacci series is a special series where nth term is the sum of previous two terms in the series. The series starts with 0 and 1 as the first and second term of the series respectively.
Here you need to get the value for nth term from user and then print Fibonacci series containing n terms.

Input
5
Output
0,1,1,2,3

Input
8
Output
0,1,1,2,3,5,8,13*/

import java.util.Scanner;

public class Day11 {
    public static void FiboDisplay(int Num)
    {
         int first = 0;
         int second = 1;
         
        System.out.println("Fibonacci Series : ");
         for(int i=1;i<=Num;i++)
         {
           System.out.println(first+ " ");
            
           //calculate next term
           int next = first + second;
           first = second;
           second = next;
         }
    }
    // print the nth fibo number using recursion
    public static int nthFibo(int No)
    {
        if(No == 0)
        {
            return 0;
        }
        else if(No == 1)
        {
            return 1;
        }else
        {
        return nthFibo(No-1) + nthFibo(No-2);
        }
    }
    public static void main(String[] args) {
        int Num = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        Num = sobj.nextInt();

        FiboDisplay(Num);

      // System.out.println("Nthe Fibonacci Number is : "+iRet);
    }
}
