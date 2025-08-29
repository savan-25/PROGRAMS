// Contaoiner with Most Water
// For given n Lines on x - axis ,use 2 lines to form a container such that
// it holds Maximum Water
// height = [1,8,6,2,5,4,8,3,7]

import java.util.ArrayList;

public class ArrayList7 {

    public static int storeWater(ArrayList<Integer> height)
    {
        int maxWater = 0;

        // brute force
       
        for(int i = 0;i<height.size();i++)
        {
            for(int j = i+1;j<height.size();j++)
            {
                int ht = Math.min(height.get(i),height.get(j));
                int Wi = j - i;

                int currWater = ht * Wi;
                maxWater = Math.max(maxWater,currWater);
            }
        }
        return maxWater;
    }
     public static void main(String args[])
     {
        ArrayList<Integer> lobj = new ArrayList<>();
      
        
       
        int iRet = storeWater(lobj);

        System.out.println(iRet);

        
     }
}
