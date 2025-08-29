// Remove the Duplicate from array
/*
   n = 5 arr = [1,2,2,2,3]
   new array = [ 1,2,3]
 */

import java.util.*;

public class RemoveDuplicate 
{
    public static int  RemoveDupli(int arr[])
    {   

        int i = 0 , iCount=0 ;
        for( int j = 1;j<arr.length;j++)
        {
          if( arr[j] != arr[i])
            i++;
            arr[i] =arr[j];
        }
        return i+1;
        
       
    }
    //Using Collection and Framework
    public static void RemoveDuplicate(int Arr[])
    {  
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<Arr.length;i++)
        {
            set.add(Arr[i]);
        }
       
        System.out.println("Value After removing duplcate");
       for(int x : set)
       {
        System.out.println(x);
       }
        

    }
    public static void main(String args[])
    {    
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int iSize = sobj.nextInt();
        int arr[]  = new int[iSize];
        System.out.print("Enter the Element of an array : ");
        for( int i=0;i<arr.length;i++)
        {
            arr[i] = sobj.nextInt();
        }
        
        // int newlength = RemoveDupli(arr);
        // System.out.println("new length after the removing duplicate: "+newlength);

        // for( int i = 0;i<newlength;i++)
        // {
        //     System.out.println(arr[i]+" ");
        // }

        RemoveDuplicate(arr);
    }
}
