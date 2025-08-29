/*Day 10 coding Statement:  Write a program to find Factorial of a number

Description

Get a number from user for which you need to fin the factorial, then calculate the factorial and give it as the output.

Input

4

Output

24 */

import java.util.Scanner;
public class Day10 {
    // using loop
    public static int Fact(int No)
    {   
        int Ans = 1;

        for(int i=1;i<=No;i++)
        {
            Ans = Ans*i;
        }
        return Ans;
    }
    // using recursion
    // recursion is a concept in which function call itself again and agin till base condition
    // every time problem get simpler
    public static int Fact2(int No)
    {

        if(No ==1)
        {
            return 1;
        }

        return No * Fact(No-1);
    }
    public static void main(String args[])
    {
        int No1 = 0;

        Scanner sobj = new Scanner(System.in);
      
        System.out.println("Enter the Number ");
        No1 = sobj.nextInt();

        int iRet = Fact2(No1);

        System.out.println("Factorial of "+No1+" is "+iRet);
    }
    
}
