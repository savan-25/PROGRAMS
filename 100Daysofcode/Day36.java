
/*
 * Day 36 coding Statement : Write a Program to Capitalize the first and last letter of each word of a string

Description

Get a string from the user and then change the first and last letter to uppercase.

Input

programming

Output

ProgramminG
 */

import java.util.Scanner;

public class Day36 {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sobj.nextLine();
        
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder();

       for(int i=0;i<str.length();i++)
       {
           if(i==0 || i==str.length()-1)
           {
            sb.append(str.charAt(i)-32);
           }
           else{
            sb.append(str.charAt(i));
           }
       }

       System.out.println(sb);
}
}
