/*Day 37 coding Statement : Write a Program to calculate the Frequency of characters in a string
Description
Get a string as the input from the user and find the frequency of characters in the string.

Input
program

Output
The frequency of a is 1
The frequency of g is 1
The frequency of m is 1
The frequency of o is 1
The frequency of p is 1
The frequency of r is 2
 */

import java.util.Scanner;
import java.util.*;


public class Day37 {
    public static void CalculateFreq(String str)
    {
          HashMap<Character,Integer> hobj = new HashMap<>();
           
          for(int i=0;i<str.length();i++)
          {
            int val = hobj.getOrDefault(str.charAt(i), 0);

            hobj.put(str.charAt(i),val+1);
          }

          for(Map.Entry<Character,Integer> itr : hobj.entrySet())
          {
             System.out.println("The Freaquency of "+itr.getKey()+" is "+itr.getValue());
          }
    }
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String :");
        String str  = sobj.nextLine();

        CalculateFreq(str);
    }    
}
