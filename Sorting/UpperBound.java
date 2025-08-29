/*
   The upper bound algorithm finds the first or the smallest index in a 
   sorted array where the value at that index is greater than the given key i.e.   

 * Problem Statement: Given a sorted array of N integers and an integer x, write a program to 
 * find the upper bound of x
 * 
 * Example 1:
Input Format: N = 4, arr[] = {1,2,2,3}, x = 2
Result: 3
Explanation: Index 3 is the smallest index such that arr[3] > x.

Example 2:
Input Format: N = 6, arr[] = {3,5,8,9,15,19}, x = 9
Result: 4
Explanation: Index 4 is the smallest index such that arr[4] > x.
 */

public class UpperBound {
    // Brute force Approach
    public static int UpperBound(int Arr[],int x)
    {
        

        for(int i=0;i<Arr.length;i++)
        {
            if(Arr[i] > x)
            {
                return i;
            }
        }
        return x;
      
    }
    // Optimal approach

    public static int UpperBound2(int Arr[],int x)
    {
        int low = 0;
        int high = Arr.length - 1;
        int ans = Arr.length;

        while(low <= high)
        {
            int mid = (low+high)/2;

            if(Arr[mid] > x)
            {
                ans = mid;
              high = mid-1;

            }
            else
            {
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String args[])
    {
         int arr[] = {3,5,8,9,15,19};

         int key = 9;

        int iRet = UpperBound2(arr,key);

        System.out.println(iRet);
    }
    
}
