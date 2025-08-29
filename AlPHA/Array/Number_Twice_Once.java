
/*
 * Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one. 
 * Find that single one.
 * 
 * Example 2:
Input Format:
 arr[] = {4,1,2,1,2}
Result:
 4
Explanation:
 In this array, only element 4 appear once and the other elements appear twice. So, 4 is the answer.
 */

import java.util.HashMap;
import java.util.Map;
public class Number_Twice_Once 
{    
    //Brute Force

    public static int getSingleElement(int Arr[])
    {
        int Ans = 0;
        int iCount = 0;

        for(int i =0;i<Arr.length;i++)
        {
            for(int j = 0;j<Arr.length;j++)
            {
                if(Arr[i] == Arr[j])
                {
                   iCount++;
                }
            }
            if(iCount == 1)
            {
                Ans = Arr[i];
            }
        }
        return Ans;
    }
   public static int getSingleElement1(int Arr[])
   {
       int Ans = 0;

       int n = Arr.length;

       //Declare the hashmap
       //And hash the given array
       HashMap<Integer,Integer> mpp = new HashMap<>();

       for(int i = 0;i<n;i++)
       {
        int value = mpp.getOrDefault(Arr[i],0);
        mpp.put(Arr[i], value + 1);
       }

       //find Single element and return the answer
       for(Map.Entry<Integer,Integer> it : mpp.entrySet())
       {
        if(it.getValue() == 1)
        {
            Ans = it.getKey();
        }

       }

       return Ans;
   }
    // 
    public static void main(String args[])
    {
       int Arr[] = {4,1,2,1,2};
      // int iRet = getSingleElement(Arr);
       //System.out.println(iRet);

       int iRet = getSingleElement1(Arr);
       System.out.println(iRet);
    }
}
