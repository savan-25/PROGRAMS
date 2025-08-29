import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.*;

class Prime
{   
   // 
   public static boolean CheckPrime(int No)
   {
       boolean bRet = true;

       for(int i=2;i<No/2;i++)
       {
         if(No % i == 0)
         {
            bRet = false;
            break;
         }
       }
       return bRet;

   }
   public static void main(String args[]) throws IOException
   { 
     InputStreamReader iS = new InputStreamReader(System.in);
     BufferedReader br  = new BufferedReader(iS);
      int No = 0;
      System.out.println("Enter the Number : ");
      No = br.read();

      boolean bRet = CheckPrime(No);

      if(bRet)
      {
         System.out.println("Given Number is Prime Number");
      }else
      {
         System.out.println("Number is not prime Number");
      }
   }
}