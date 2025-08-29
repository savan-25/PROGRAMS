// Swap 2 Numbers
import java.util.ArrayList;

public class ArrayList4 {
     public static void swap(ArrayList<Integer> list,int indx1,int indx2)
     {
        int temp = list.get(indx1);

        list.set(indx1, list.get(indx2));
        list.set(indx2 , temp);
     }
       public static void main(String[] args) 
    {
        ArrayList<Integer> lobj = new ArrayList<>();

        lobj.add(11);
        lobj.add(21);
        lobj.add(51);
        lobj.add(101);
        lobj.add(111);
        
    
        int idx1 = 1 , idx2 = 2;

        System.out.println(lobj);

        swap(lobj, idx1, idx2);

        System.out.println(lobj);
         
      

    }
}
