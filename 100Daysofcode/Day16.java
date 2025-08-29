/*Day 16 coding Statement : Write a program to identify if the number is Perfect number or not

Description

Get the input from the user and check whether that number is a perfect number or not.

E.g. Let number is 28, factors of 28 are 1,2,4,7,14. Now the sum of all these factors are 28 itself.

Input
28
Output
Perfect Number

Input
4
Output
Not a perfect number 
 * 
 */

import java.util.Scanner;

public class Day16 {
    public static boolean CheckPerfect(int No)
    {  
        int temp = No;
        int Sum = 0;
        for(int i=1;i<=No/2;i++)
        {
            if(No % i == 0)
            {
                Sum = Sum + i;
            }
           
        }
        if(Sum == No)
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        int No = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number ");
        No = sobj.nextInt();

        boolean bRet = CheckPerfect(No);

        if(bRet)
        {
            System.out.println("These is Perfect number ");
        }
        else
        {
            System.out.println("Not a Perfect Number");
        }
    }
    
}
