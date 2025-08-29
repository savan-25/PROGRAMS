+
/*
 Problem Statement: Given an array, print all the elements which are leaders. 
 A Leader is an element that is greater than all of the elements on its right side in the array.

 Input:

 arr = [10, 22, 12, 3, 0, 6]
Output:

 22 12 6
Explanation:

 6 is a leader. In addition to that, 12 is greater than all the elements in its right side (3, 0, 6), also 22 is greater than 12, 3, 0, 6.
 */

import java.util.ArrayList;

public class Leader_Array {
    
    public static ArrayList<Integer> LeaderArray(int Arr[])
    {  
        ArrayList<Integer> list = new ArrayList<>();
       
        for(int i =0 ;i<Arr.length;i++)
        {   boolean leader = true;
            for(int j =i+1;j<Arr.length;j++)
            {
                if(Arr[j] > Arr[i])
                {
                    leader = false;
                    break;
                }
               

            }
            if(leader)
            {
                list.add(Arr[i]);
            }
        }
        return list;
    }
    // Optimal Approach
    // Last Element is always Leader
    public static ArrayList<Integer> LeaderArray2(int Arr[])
    {   
        int n = Arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        
        int max = Arr[n-1];
        list.add(0, Arr[n-1]);  // Using add(0, element) instead of addFirst()
        
        for(int i=n-2; i>=0; i--) {
            if(Arr[i] > max) {
                list.add(0, Arr[i]);  // Using add(0, element) instead of addFirst()
                max = Arr[i];
            }
        }
        return list;
        
    }

    // another question is in my mind is consider they said element is gretater the its left side element
    public static ArrayList<Integer> LeaderArrayLeft(int Arr[])
    {
        int n = Arr.length;
        ArrayList<Integer> list = new ArrayList<>();

        int Max = Arr[0];
        list.add(Arr[0]);

        for(int i =1;i<n;i++)
        {
            if(Arr[i] > Max )
            {
                list.add(Arr[i]);
                Max = Arr[i];
            }
        }
        return list;
        }
    public static void main(String[] args) 
    {
        int Arr[] = {10, 22, 12, 3, 0, 6};

      ArrayList<Integer> ans= LeaderArrayLeft(Arr);

     
      for (int i = 0; i < ans.size(); i++) {
        System.out.print(ans.get(i)+" ");
      }
    }
    
}
