/*  * Problem Statement: You are given an array of ‘N’ integers.
 *  You need to find the length of the longest sequence which contains the consecutive elements.
 * 
 *  [3, 8, 5, 7, 6]

Output:
 4

Explanation:
 The longest consecutive subsequence is 5, 6, 7, and 8.
 */

 import java.util.*;
 public class Longest_Cosecutive_Seq {

    public static void main(String args[])
    {
        int Arr[] = {3, 8, 5, 7, 6};

         int iRet = Longest_Seq3(Arr);

        System.out.println("Longest Seq is"+iRet);
        
      
    
    }



     
      public static boolean LinearSearch(int Arr[],int iNo)
      {  
         boolean bRet = false;
        for(int i = 0;i<Arr.length;i++)
        {
         if(Arr[i] == iNo)
         {
             return true;
         }
        }
        return bRet;
      }
      public static int Longest_Seq(int Arr[])
      {
         int n = Arr.length;
 
         int longest = 1;
 
         for(int i = 0;i<n;i++)
         {
             int x = Arr[i];
             int cnt  = 1;
 
             while(LinearSearch(Arr, x+1) == true)
             {
                 x = x + 1;
                 cnt +=1;
             }
             longest = Math.max(longest, cnt);
         }
         return longest;
      }
      //better approach
 
      public static int  Longest_Seq2(int Arr[])
      {
         Arrays.sort(Arr);
 
       int Longest = 1;
       int LastSmall =Integer.MIN_VALUE;
       
       int count = 0;

       for(int i = 0;i<Arr.length;i++)
       {

        if(Arr[i] - 1 == LastSmall)
        {
            LastSmall = Arr[i];
            count++;   
        }
        else if(Arr[i] != LastSmall){
              count = 1;
             LastSmall = Arr[i];
        }

        Longest = Math.max(Longest,count);
         
       }
  
    return Longest;
      }


      // better approach

      public static int Longest_Seq3(int Arr[])
      {
        Arrays.sort(Arr);

        int Longest = 1;
        int count = 1;
    
        for (int i = 1; i < Arr.length; i++) {
            if (Arr[i] == Arr[i - 1] + 1) {
                count++;
            } else if (Arr[i] != Arr[i - 1]) {
                Longest = Math.max(Longest, count);
                count = 1;
            }
        }
    
        Longest = Math.max(Longest, count);
        return Longest;
      }


     
 }
 