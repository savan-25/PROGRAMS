/*
   Day 32 coding Statement : Write a Program to Remove vowels from a string

Description
Get a string as the input from the user and then remove all the vowel letters from the string and give the output.

Input
remove

Output
rmv
 */

import java.util.Scanner;

public class Day32 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the String ");

        String str = sobj.nextLine();
         StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);

            if(ch !='a' && ch !='e' && ch != 'i' && ch != 'o' &&  ch !='u')
            {
               sb.append(ch);
            }
        }
        System.out.println(sb);

    
    }
}
