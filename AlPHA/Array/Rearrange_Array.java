/* 
There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements. 
Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values.
 * Example 1:

Input:
arr[] = {1,2,-4,-5}, N = 4
Output:
1 -4 2 -5

Explanation: 

Positive elements = 1,2
Negative elements = -4,-5
To maintain relative ordering, 1 must occur before 2, and -4 must occur before -5.
 */

import java.util.ArrayList;
public class Rearrange_Array {
  // Created By me
    public static void Rearrange(int Arr[])
    {    
        int n = Arr.length/2;
        int A[] = new int[n];
        int B[] = new int[n];
        int p =0;
        int q = 0;
      for(int i = 0;i<Arr.length;i++)
      {
           if(Arr[i] > 0)
           {
              A[p] = Arr[i];
              p++;
           }
           else
           {
            B[q] = Arr[i];
            q++;
           }
      }
      int m = 0;
      int o = 0;
      for(int i =0;i<Arr.length;i++)
      {
        if(i%2 ==0)
        {
            System.out.print(A[m]+"\t");
            m++;
        }
        else
        {
            System.out.print(B[o]+"\t");
            o++;
        }
      }
    }
    //First approcah - brute force

    public static int[] Rearrange1(int Arr[])
    {  
      ArrayList<Integer> pos = new ArrayList<>();
      ArrayList<Integer> neg = new ArrayList<>();

      // Segregate the Array into Positive and Negative

      for(int i=0;i<Arr.length;i++)
      {
        if(Arr[i]> 0)
        {
          pos.add(Arr[i]);
        }
        else
        {
          neg.add(Arr[i]);
        }
      }
      // Positive on Even index , Negative on Odd index
      for(int i =0;i<Arr.length/2;i++)
      {
        Arr[2*i] = pos.get(i);
        Arr[2*i+1] = neg.get(i);
      }
      return Arr;
    }

    // Optimal Approach
    public static int[] Rearrange2(int Arr[])
    {
      int n = Arr.length;

     int Ans[] = new int[n];
      int PosIndex =0 , NegIndex = 1;

      for(int i=0;i<Arr.length;i++)
      {
        if(Arr[i] < 0)
        {
          Ans[NegIndex] = Arr[i];
          NegIndex +=2;
        }
        else{
          Ans[PosIndex] = Arr[i];
          PosIndex +=2;
        }
      }
      return Ans;
    }
    public static void main(String args[])
    {
       int Brr[] = {1,2,-4,-5};
          int newArr[]= Rearrange2(Brr);
          for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
          }
        
    }
    
}
