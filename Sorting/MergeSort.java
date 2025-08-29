/*
 * Problem:  Given an array of size n, sort the array using Merge Sort.

Examples:

Example 1:
Input: N=5, arr[]={4,2,1,6,7}
Output: 1,2,4,6,7,


Example 2:
Input: N=7,arr[]={3,2,8,5,1,4,23}
Output: 1,2,3,4,5,8,23

Concept:
     Merge Sort is a divide and conquers algorithm, it divides the given array into equal parts and then merges the 2 sorted parts. 
     There are 2 main functions :

     merge(): This function is used to merge the 2 halves of the array. It assumes that both parts of the array are sorted and merges both of them.
     mergeSort(): This function divides the array into 2 parts. low to mid and mid+1 to high where,

    low = leftmost index of the array
    high = rightmost index of the array
    mid = Middle index of the array 

    We recursively split the array, and go from top-down until all sub-arrays size becomes 1.

 */
import java.util.ArrayList;
class Solution
{
    public static void merge(int Arr[],int low,int mid,int high)
    {
        ArrayList<Integer> temp = new ArrayList<>();//temporary Array

    int left = low;    //starting index of left half of arr
    int rigth = mid+1; // starting index of right half of arr

    while(left <= mid && right <= high)
    {
        if(Arr[left] <=)
    }
    }

}
public class MergeSort {
    public static void main(String[] args)
    {

        
    }
    
}


/*
 * Approach:

    We will be creating 2 functions mergeSort() and merge().
    mergeSort(arr[], low, high):
    In order to implement merge sort we need to first divide the given array into two halves.
    Now, if we carefully observe, we need not divide the array and create a separate array, but we will divide the array's range into halves every time.
    For example, the given range of the array is 0 to 4(0-based indexing). Now on the first go, we will divide the range into half like (0+4)/2 = 2. So, 
    the range of the left half will be 0 to 2 and for the right half, the range will be 3 to 4. Similarly, if the given range is low to high, the range for the two halves will be low to mid and mid+1 to high, where mid = (low+high)/2. 
    This process will continue until the range size becomes.
    So,
     in mergeSort(), we will divide the array around the middle index(rather than creating a separate array) by making the recursive call :
    1. mergeSort(arr,low,mid)   [Left half of the array]
    2. mergeSort(arr,mid+1,high)  [Right half of the array]
    where low = leftmost index of the array, high = rightmost index of the array, and mid = middle index of the array.
    Now, in order to complete the recursive function, we need to write the base case as well. We know from step 2.1, that our recursion ends when the array has only 1 element left. So, the leftmost index, low, and the rightmost index high become the same as they are pointing to a single element.
    Base Case: if(low >= high) retu
 */