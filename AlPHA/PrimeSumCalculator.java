/*
 * you are given two integer m and n .your task is to compute the sum of mth prime
 *  number to the (m+n)th prime number inclusively
 */

import java.io.BufferedReader;
import java.io.*;
import java.io.InputStreamReader;

class PrimeSumCalculator
{  
    public static boolean isPrime(int num )
    {
        boolean bRet = true;
        if(num < 2)
        {
            return false;
        }
        for (int i = 2; i*i <= num; i++) 
        {
            if(num % i == 0)
            {
                bRet = false;
            }
            
        }
        return bRet;
    }
    public static void main(String[] args) throws IOException
    {
        InputStreamReader ip = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(ip);

        System.out.print("Enter the m Starting index");
        int m = Integer.parseInt(br.readLine());

        System.out.println("Enter the Ending index ");
        int n = Integer.parseInt(br.readLine());

        int Sum = 0, count = 0 ,num = 2;// starting index
        int startIndex = m;
        int endIndex = m+n;

        while(count < endIndex)
        {
           if(isPrime(num))
           {
            count++;
            if(count >= startIndex)
            {
                Sum +=num;
            }
           }
           num++;
        }

        System.out.println("Sum of Prime Number is : "+Sum);

    }
}