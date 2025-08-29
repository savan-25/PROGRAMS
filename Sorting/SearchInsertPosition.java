/*
 * Problem Statement: You are given a sorted array arr of distinct values and a target value x. You need to search for
 *  the index of the target value in the array.
 * 
 * If the value is present in the array, then return its index. Otherwise, determine the index where it would be inserted in the array while maintaining the sorted order
 */
public class SearchInsertPosition {
     
    // using Brute force approach
    public static int InsertPos(int Arr[],int element)
    {
        int iRet = 0;
        
        for(int i=0;i<Arr.length;i++)
        {  
            if(Arr[i] == element )
            {
                return 1;
            }
            if(Arr[i] > element)
            {
                iRet = i;
                break;
            }
        }

        return iRet;

    }
    // use the best approach using binary search approach

    public static int  InsertPos1(int Arr[],int element)
    {
        int left = 0 , right = Arr.length -1;

        while(left <= right)
        {
            int mid = left + (right-left)/2;

            if(Arr[mid] == element)
            {
               return mid;
            }
            if(Arr[mid] < element)
            {
                left = mid+1;
            }
            else{
                right = mid-1;
            }

        }
        return left;
    }
    public static void main(String args[])
    {
        int Arr[] = {1};
        int x = 0;
        int iRet = 0;

        iRet = InsertPos1(Arr,x);

        System.out.println(iRet);
    }
    
}
/*
 * Time Complexity: O(logN), where N = size of the given array.
Reason: We are basically using the Binary Search algorithm
 */