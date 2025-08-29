/*
 * Day 19 coding Statement : Write a program to identify if the number is Armstrong number or not

Description

Get an input number from user and check whether the given number is an Armstrong number or not.

E.g. Let the number be 1634,

Here 1^4 + 6^4 + 3 ^4 + 4^4 = 1634

Therefore, this is an Armstrong number

Input

153

Output

Armstrong number

Input

121

Output

Not an Armstrong number  
 */

import java.util.Scanner;

public class Day18 {
    public static boolean CheckArmstrong(int No)
    {
        int len = String.valueOf(No).length();

        int temp = No;
        int CubeSum = 0;
        while(temp > 0)
        {
            int digit = temp % 10;
            CubeSum +=Math.pow(digit,len);
            temp = temp / 10; 
        }

        if(CubeSum == No)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int No = sobj.nextInt();

        boolean bRet = CheckArmstrong(No);

        if(bRet==true)
        {
            System.out.println("Given Number is Armstrong");
        }
        else
        {
            System.out.println("given number is Not Armstrong");
        }
    }
}
