/*
 Input: num = "52"
Output: "5"
Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
Example 2:

Input: num = "4206"
Output: ""
Explanation: There are no odd numbers in "4206".
Example 3:

Input: num = "35427"
Output: "35427"
 */
import java.util.Scanner;
public class Largest_OddNumber {
    
    public static void main(String args[])
    {
         Scanner sobj = new Scanner(System.in);
         
         System.out.println("Enter he Number ");
         String no ;
         no = sobj.nextLine();

         String Largestodd = "";

         for(int i = no.length()-1;i>=0;i--)
         {
            if((no.charAt(i) - '0') % 2 != 0)
            {
                Largestodd = no.substring(0, i+1);
                break;

            }
         }
         System.out.println("Largest Odd Number is : "+Largestodd);
    }
}

