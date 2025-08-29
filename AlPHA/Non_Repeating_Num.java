/*
 Given an array of integers of size N, the task is to find the first non-repeating element in this array. 

Examples:


Input: {-1, 2, -1, 3, 0}
Output: 2
Explanation: The first number that does not repeat is : 2


Input: {9, 4, 9, 6, 7, 4}
Output: 6
 */

import java.util.HashMap;

public class Non_Repeating_Num {
   
    // Using Brute Force
    public static int Non_Rept1(int Arr[])
    {
        int iRet = -1; // return the Non - repeatating Number
        
        for (int i = 0; i < Arr.length; i++) {
            boolean NonRepatating = true;

            for (int j = 0; j < Arr.length; j++) {
                
                if(i != j && Arr[i] == Arr[j])
                {
                    NonRepatating = false;
                    break;
                }
            }
            if(NonRepatating)
            {
                iRet = Arr[i];
                break;
            }
        }
        return iRet;
        
    }

    // using Optimal Approach - HashMap
    public static int Non_Rept2(int Arr[])
    {   
        //step -1 HashMap to Store elements and its Count
        HashMap<Integer,Integer> hobj = new HashMap<>();

        int iRet = -1;

        for (int element : Arr) {
            
            int val = hobj.getOrDefault(element,0);

            hobj.put(element,val+1);
        }
        for (int itr : Arr) 
        {
            if(hobj.get(itr) == 1)
            {
                iRet = itr;
                break;
            }
        }
        return iRet;
    }


    public static void main(String[] args) {
        int Arr[] = {-1, 2, -1, 3, 0};

        int Ans = Non_Rept2(Arr);

        System.out.println("First Non-Repeating Number : "+Ans);

    }
    
}
