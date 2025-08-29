/*Day 39 coding Statement : Write a Program to check if two strings are Anagram or not

Description

Get two strings as input from the user and check whether it is Anagram or not.

Input
sunlight thgiluns

Output
Anagram
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Day39 {
    // check using brute force algorithm
    public static boolean CheckAnagram(String str1,String str2)
    {
        boolean bRet = false;
        
        int len1 = str1.length()-1;
        int len2 = str2.length()-1;
        
        if(len1 != len2)
        {
            return false;
        }
        for(int i=0;i<str1.length();i++)
        {
          char ch = str1.charAt(i);
          int flag = 0;
          for(int j=0;j<str2.length();j++)
          {
            if(ch == str2.charAt(j))
            {
                flag = 1;
            }
          }
        if(flag == 0)
        {
            return false;
        }
        }
     return true;

    }
     
     public static boolean CheckAnagram2(String s1,String s2)
     {
        boolean bRet = true;

        if(s1.length() != s2.length())
        {
            bRet = false;
        }
        else
        {
            char arr1[] = s1.toLowerCase().toCharArray();
            char arr2[] = s2.toLowerCase().toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            bRet = Arrays.equals(arr1,arr2);
        }
        return bRet;
        
    }
    
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String :");
        String str1 = sobj.nextLine();

        System.out.println("enter the Another string");
        String str2 = sobj.nextLine();
        
        boolean bRet = CheckAnagram2(str1,str2);

        if(bRet)
        {
            System.out.println("Given string are Anagram");
        }
        else
        {
            System.out.println("given string are not Anagram");
        }
    }
}
