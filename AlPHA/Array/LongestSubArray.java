/*
 * Problem Statement: Given an array and a sum k, 
 * we need to print the length of the longest subarray that sums to k.
 * 
 * Example 1:
Input Format: N = 3, k = 5, array[] = {2,3,5}
Result: 2
Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.
 */

import java.util.HashMap;

class LongestSubArray
{  
  public static int Longest(int Arr[],int target)
  { 
    int Longest = 0;
    int Sum = 0;
  
    for(int i = 0;i<Arr.length;i++)
    { Sum = 0;
      for(int  j = i;j<Arr.length;j++)
      {
         Sum = Sum+Arr[j];
         if(Sum == target &&  (j -i+1) > Longest)
         {
            Longest = (j-i+1);
         }
      }
     
    }
    return Longest;
    
  }
  public static void main(String args[])
  {
    int Arr[] = {1,2,3,1,1,4,2,3};
    int iRet = Longest(Arr,3);
    System.out.println(iRet);


  }
}