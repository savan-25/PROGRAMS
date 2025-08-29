/* Rotate array by K elements

  Problem Statement: Given an array of integers, rotating array of elements by k elements either left or right.

Examples:

Example 1:
Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
Output: 6 7 1 2 3 4 5
Explanation: array is rotated to right by 2 position .

Example 2:
Input: N = 6, array[] = {3,7,8,9,10,11} , k=3 , left 
Output: 9 10 11 3 7 8
Explanation: Array is rotated to right by 3 position.
*/

class Left_Rotate
{   
    public static void Left_Rotate_D(int Arr[],int n,int d)
    {
        d = d % n;

        int temp[] = new int[d];
        for(int i=0;i<d;i++)
        {
            temp[i] = Arr[i];
        }
        for(int i=d;i<n;i++)
        {
            Arr[i - d] = Arr[i];
        }
        for(int i= d;i<n;i++)
        {
            Arr[i] = temp[i - (n-d)];
        }
    }
    public static void  Right_Rotate_D(int Arr[],int n,int d)
    {
        d = d % n;

        int temp [] =new int[d];
        int j = 0;
        for(int i = n - d;i<n;i++)
        {
            temp[j] = Arr[i];
            j++;
        }
        for(int i = n-1;i>=d;i--)
        {
            Arr[i] = Arr[i-d];
        }
        for(int i=0;i<d;i++)
        {
            Arr[i] = temp[i];
        }
    }
    public static void main(String args[])
    {
        int Arr[] = {1,2,3,4,5,6,7};
        int d  = 2;

       Right_Rotate_D(Arr,7,d);

       for(int i =0;i<Arr.length;i++)
       {
        System.out.print(Arr[i]+"\t");
       }

       
    }
}