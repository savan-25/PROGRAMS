/*
 Example Problem - Maximum Sum of a Subarray with K Elements
Given an array arr[] and an integer k, we need to calculate the maximum sum of a subarray having size exactly k.

Input  : arr[] = [5, 2, -1, 0, 3], k = 3
Output : 6
Explanation : We get maximum sum by considering the subarray [300, 400]

Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}, k = 4 
Output : 39
Explanation : We get maximum sum by adding subarray {4, 2, 10, 23} of size 4.
 */

import java.util.Scanner;

public class MaximumSum {
    
    //using brute force approach
    public static int MaxSumSubArray(int Arr[],int k)
    {
        // Returns a Maximum Sum in 
        // a subarray of size k
        
        // Initialize result
        int max_sum = Integer.MIN_VALUE;
        int n = Arr.length;
        //consider all block starting with i
        for(int i=0;i<n-k+1;i++)
        {
            int current_sum = 0;

            for(int j=0;j<k;j++)
            {
                current_sum = current_sum + Arr[i+j];
            }
            max_sum = Math.max(max_sum, current_sum);
        }
        return max_sum;
    }
    // using Sliding Window approach

    public static int MaxSumSubArray2(int Arr[],int k)
    {
          int n = Arr.length;

          // n must greater than k
          if(n<k)
          {
            System.out.println("Invalid window size");
            return -1;
          }
          // First calculate the Sum of Window element
          int maxsum = 0;
          for(int i=0;i<k;i++)
          {
             maxsum += Arr[i];
          }


          // calcualte the same for remaining element
          int windowSum = maxsum;
          for(int i=k;i<n;i++)
          {
            windowSum = Arr[i] - Arr[i-k];
            maxsum = Math.max(maxsum,windowSum);
          }
          return  maxsum;
    }
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Size of An Array : ");
        int iSize = sobj.nextInt();

        System.out.println("Enter the Size of Window");
        int iWin = sobj.nextInt();

        int Arr[] = new int[iSize];
        
        System.out.println("Enter an Array Element ");
        for(int i=0;i<iSize;i++)
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.println("Give Array is :");
        for(int x : Arr)
        {
            System.out.print(x+"\t");
        }


        int iMaxSum = MaxSumSubArray2(Arr,iWin);

        System.out.println("Maximum Sum of a SubArray is :"+iMaxSum);
    }
}
