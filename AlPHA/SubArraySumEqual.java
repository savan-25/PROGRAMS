/*
 Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

 

Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2
 */
class SubArraySumEqual
{  
    public static int SumEqual(int Arr[],int k)
    {
        //use brute Force to Find 
        int iSum = 0;
        int Count = 0;
        for (int i = 0; i < Arr.length; i++) {
            iSum = 0;
            for (int j = i; j < Arr.length; j++) {
                iSum +=Arr[j];

                if(iSum == k)
                {
                    Count++;
                    
                }
            }
        }
        return Count;
    }
    // Sliding window
    public static SumEqual(int Arr[],int k)
    {
        
    }
    public static void main(String args[])
    {
        int Arr[] = {1,-1,0};

       int iRet =  SumEqual(Arr,0);

       System.out.println("Count of Subarray Pair is :"+iRet);
    }
}