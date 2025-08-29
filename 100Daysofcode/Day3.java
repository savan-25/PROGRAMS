/*
 * Day 3 coding Statement: Write a program to find ASCII values of a character

Description:
Get an input character from the user and give the ASCII value of the given input as the output.
Input:
b
Output:
98

Input:
B
Output:
66
 */

import java.util.Scanner;

public class Day3 {
    public static int ReAscii(char ch)
    {   
        //using type casting
        int Asci = ch;
          int a = 98;

          //char b = (char)a;
          //System.out.println(b);
        return Asci;

    }
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the character");
        char ch = sobj.nextLine().toLowerCase().charAt(0);

        int iRet = ReAscii(ch);

        System.out.println("Ascii value of"+ch+"is"+iRet);

    }
    
}
