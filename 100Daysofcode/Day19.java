/*
 * Day 20 coding Statement : Write a program to identify if the number is Prime number or not

Description

Get a number as input from the user and check whether that number is prime or not.

A prime number is a number with factors as 1 and that number itself.

Input
1
Output
1 is not a prime number

Input
5
Output
5 is a prime number  
 */

import java.util.Scanner;

public class Day19 {


    public static boolean CheckPrime(int Num)
    {
       boolean bRet = true;
       if(Num <= 1)
       {
          return false;
       }

       for(int i=2;i<=Num/2;i++)
       {
        if(Num % i ==0)
        {
            bRet = false;
        }
       }
       return bRet;
    }
    /*Because if a number n is divisible by some number greater than √n, it must also be divisible by a number smaller than √n. */
    public static boolean CheckPrime2(int num)
    {
        if(num <=1)
        {
            return false;
        }

        for(int i=2;i<=(int)Math.sqrt(i);i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
       Scanner sobj = new Scanner(System.in);
       
       int No = 0;
       boolean bRet = false;

       System.out.println("Enter the Number :");
       No = sobj.nextInt();

      bRet = CheckPrime(No);

      if(bRet)
      {
        System.out.println("given number is Prime ");
      }
      else
      {
        System.out.println("the give number is not prime");
      }
      sobj.close();

    }
}
