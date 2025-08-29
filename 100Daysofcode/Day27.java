/*
27 coding Statement : Write a program to find the double of the given number without using arithmetic operator

Description
For the given input number calculate the double of it without using arithmetic operator.

Input
4
Output
8

 
 */
import java.util.Scanner;

public class Day27 {
    public static int DoubleNum(int No)
    {
        int Ans = 0;

        Ans = No << 1;

        return Ans;
    }
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number :");
        int No = sobj.nextInt();

        int iRet = DoubleNum(No);

        System.out.println("Number after double is : "+iRet);

    }
}
