/*
 * 
Day 24 coding Statement : Write a program to print Pyramid pattern using stars

Description

Get the number of lines as the input and print stars in that many lines or rows in a pyramid shape.

Input

4

Output

  *
  ***
 *****
******

 */
import java.util.Scanner;
public class Day24 {
    public static void Display(int iNo)
    {
      for(int i=1;i<=iNo;i++)
      {
        for(int j=0;j<(iNo-i);j++)
        {
            System.out.print(" ");
        }
        for(int k=1;k<=(2*i-1);k++)
        {
            System.out.print("*");
        }
        System.out.println();
      }
    }
    public static void main(String[] args) 
    {
        int iRow = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the total number of row");
        iRow = sobj.nextInt();

        Display(iRow);

        
    }
}
