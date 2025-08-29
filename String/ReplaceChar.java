// Java Program to replace a characcter with its occurence in given String

import java.util.Scanner;

public class ReplaceChar {
    public static void RChar(String str)
    { 
        StringBuilder sb = new StringBuilder();

        // Code Replacing T with its Occurence
         Scanner sobj = new Scanner(System.in);
         System.out.print("Enter the Charcter");
         char ch = sobj.next().charAt(0);
        
        if(str.indexOf(ch) == -1)
        {
            System.out.println("Given Character is NOt Available in String..");
            return;
        }
         Integer iCount = 1;
        for(int i =0;i<str.length();i++)
        {
            if(ch == str.charAt(i))
            {
                sb.append(iCount.toString());
                iCount++;
            }
            else{
                sb.append(str.charAt(i));
               }
        }
        System.out.println(sb.toString());

    }
    public static void main(String args[])
    {
        String str = "OPENTEXT";

        RChar(str);
    }
    
}
