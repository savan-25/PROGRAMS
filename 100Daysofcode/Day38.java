/* 

Day 38 coding Statement : Write a Program to print Non-repeating characters in a string

Description
Get a string as the input from the user and print the non-repeating characters in a string.

Input
Hello

Output
H e o */

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Day38 {
    public static void NonRepeating(String str)
    {
        // using brute force
        for(int i=0;i<str.length();i++)
        {  
            char ch = str.charAt(i);
            int icount = 0;
            for(int j=0;j<str.length();j++)
            {
                if(ch == str.charAt(j))
                {
                    icount++;
                    
                }

            }
            if(icount <= 1)
            {
                System.out.print(str.charAt(i)+" ");
            }
        }
    }
    // using HashMap
    public static void NonRepeating1(String str)
    {
        HashMap<Character,Integer> hobj = new HashMap<>();

        for(int i =0;i<str.length();i++)
        {
            int val = hobj.getOrDefault(str.charAt(i),0);

            hobj.put(str.charAt(i), val+1);
        }

        for(Map.Entry<Character,Integer> itr : hobj.entrySet())
        {
             if(itr.getValue() <= 1)
             {
                System.out.print(itr.getKey()+" ");
             }
        }
    }
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter thr String :");
        String str = sobj.nextLine();

        NonRepeating1(str);
    }   
}
