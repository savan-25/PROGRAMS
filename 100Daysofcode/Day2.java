/*
 * Day 2 coding Statement : Write a program to identify if the character is an alphabet or not.

Description:

Take an input character from user and check whether it is an alphabet or not.

Input :
A
Output: 
Alphabet

Input:
7
Output:
Not an alphabet
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Day2 {

    public static void main(String[] args) throws IOException
    {
        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the Character " );
        char ch = bRead.readLine().toLowerCase().charAt(0);

        if(ch < 'a' || ch > 'z')
        {
           System.out.println("Not an Alphabet");
        }
        else
        {
            System.out.println("Alphabet");
        }
        
    }
    
}
