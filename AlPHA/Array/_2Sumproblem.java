/*
 * Two Sum : Check if a pair with given sum exists in Array

Problem Statement: Given an array of integers arr[] and an integer target.

1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.

2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.

Note: You are not allowed to use the same element twice. Example: If the target is equal to 6 and num[1] = 3, then nums[1] + nums[1] = target is not a solution.

Example 1:
Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 14
Result: YES (for 1st variant)
       [1, 3] (for 2nd variant)
Explanation: arr[1] + arr[3] = 14. So, the answer is “YES” for the first variant and [1, 3] for 2nd variant.
 */

import java.util.*;
public class _2Sumproblem {
    
    public static String _2Sum(int Arr[],int target)
    {
      
        for(int i = 0;i<Arr.length;i++)
        {
            for(int j =i+1;j<Arr.length;j++)
            {
                if(Arr[i] + Arr[j] == target)
                {
                    return "Yes";
                }
            }
        }
        return "No";
    }
    //using HashMap  
    public static String _2SumH(int Arr[],int target)
   {
          HashMap<Integer ,Integer> hmap = new HashMap<>();

          for(int i =0;i<Arr.length;i++)
          {
                 int num = Arr[i];
                 int morenedded = target - num;

                 if(hmap.containsKey(morenedded))
                 {
                    return "Yes";
                 }
                 hmap.put(Arr[i], i);
          }
          return "No";
} public static boolean Check(int Arr[],int target)
    {
        int start = 0;
        int end = Arr.length-1;

        while(start<end)
        {
            if(Arr[start]+Arr[end] == target)
            {
                return true;
            }
            else if(Arr[start]+Arr[end] > target)
            {
                end--;
            }
            else
            {
                start++;
            }
        }
        return false;
    }

    public static void main(String args[])
    {
        int Arr[] = {2,6,5,8,11};
        int target = 14;

        System.out.println(_2SumH(Arr, target));
    }
    
}
