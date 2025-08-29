
/*
 *   In Selection Sort is Simple Comparison based sorting algorithm that 
 *  divides input into two parts sorted and unsorted sorted at left and unsorted at right
 *   
 *  we find minimum element in left part and swap it with current element
 */

import java.util.Scanner;


class Sort 
{
    void  SelSort(int Arr[])
    { 

        int min = 0 ,temp = 0;
         for(int i=0;i<Arr.length-1;i++)
         { 
            min = i;
            for(int j=i+1;j<Arr.length;j++)
            {
              if(Arr[j] < Arr[min])
              {
                min = j;
              }
            }
            temp = Arr[i];
            Arr[i] = Arr[min];
            Arr[min] = temp;
         }


    }
}
class SelectionSort
{
    public static void main(String args[])
    {
          int n = 0;
          
          System.out.println("Enter the Size of An Array : ");
          Scanner sobj = new Scanner(System.in);

          n = sobj.nextInt();
           
          int Arr[] = new int[n];
          for(int i=0;i<n;i++)
          {
            Arr[i] = sobj.nextInt();
          }

    }
}