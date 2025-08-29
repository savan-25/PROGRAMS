// Contaoiner with Most Water
// For given n Lines on x - axis ,use 2 lines to form a container such that
// it holds Maximum Water
// height = [1,8,6,2,5,4,8,3,7]

import java.util.ArrayList;

public class ArrayList8 {

    public static int storeWater(ArrayList<Integer> height)
    {
        int maxWater = 0;

        // Two Pointer
         
        int iSize = height.size();
        int p = height.get(0);
        int q = height.get(iSize-1);
        
        for(int i = 0;i<height.size();i++)
        {
            
        }
        return maxWater;
    }
     public static void main(String args[])
     {
        ArrayList<Integer> lobj = new ArrayList<>();

        lobj.add(1);
        lobj.add(8);
        lobj.add(6);
        lobj.add(2);
        lobj.add(5);
        lobj.add(4);
        lobj.add(8);
        lobj.add(3);
        lobj.add(7);

        int iRet = storeWater(lobj);

        System.out.println(iRet);

        
     }
}
