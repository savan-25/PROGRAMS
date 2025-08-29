
/*
 * Problem Statement: Given an array of N integers, write a program to return an element that occurs more than N/2 times in the given array. 
 * You may consider that such an element always exists in the array.
 * 
 * Input Format:
  N = 7, nums[] = {2,2,1,1,1,2,2}

Result
: 2
 */
import java.security.KeyStore.Entry;
import java.util.*;

class Practice 
{   
    public static int majority(int Arr[])
    {
        int n = Arr.length;
        int iCount = 0;
        for(int i = 0;i<n;i++)
        {
            for(int j =0;j<n;j++)
            {
                if(Arr[i] == Arr[j])
                {
                    iCount ++;
                }
                if(iCount > 3)
                {
                    return Arr[i];
                
                }
            }
        }
        return -1;

    }
    //Using hashing
    public static int majority2(int Arr[])
    {
        int n = Arr.length;
        HashMap<Integer,Integer> hobj = new HashMap<>();

        for(int i = 0;i<n;i++)
        {
          int val = hobj.getOrDefault(Arr[i], 0);
          hobj.put(Arr[i],val+1);
        }
        for(Map.Entry<Integer,Integer> it : hobj.entrySet())
        {
            if(it.getValue() > (n/2))
            {
                return it.getKey();
            }
        }

        return -1;
    }
    // optimal approach
    public static int majority3(int Arr[])
    {
        int count = 0;
        int element = 0;
        for(int i =0;i<Arr.length;i++)
        {
            if(count  ==0)
            {
                count = 1;

                element = Arr[i];
            }else if(element == Arr[i] )count++;
            else 
            {
                count --;
            }
        }
        // checking stored element is majority element
        int count1 = 0; 
        for(int i =0;i<Arr.length;i++)
        {
            if(Arr[i] == element)
            {
                count1++;
            }

        }
        if(count1 > (Arr.length / 2))
        {
            return element;

        }
        return -1;
    }
    public static void main(String ars[])
    {
        int Arr[] = {2,2,1,1,1,2,1,1};

        System.out.println(majority3(Arr));
    }
}