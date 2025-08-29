/*Day 35 coding Statement : Write a Program to Count the sum of numbers in a string

Description

Get a string from the user and find the sum of numbers in the string.

Input

Hello56

Output

11 */

import java.util.Scanner;

public class Day35 {
    public static int CountNum(String str)
    {
        int Sum = 0;

      
        str = str.toLowerCase();

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
            {
                
            }
            else
            {
                Sum = Character.getNumericValue(str.charAt(i))+Sum;
            }
        }
        return Sum;

        

    }
    public static void main(String args[])
{
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter the String :");
    String str = sobj.nextLine();

    int iSum = CountNum(str);
    
    System.out.println(iSum);
}
    
}
