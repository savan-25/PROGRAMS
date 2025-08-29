// Print Reverse of an ArrayList

import java.util.ArrayList;

class ArrayList2
{
    public static void main(String[] args) {
        ArrayList<Integer> lobj = new ArrayList<>();

        lobj.add(5);
        lobj.add(3);
        
        lobj.add(2);
        
        lobj.add(1);
       for(int a : lobj)
       {
        System.out.println(a);
       }
        
       for(int i = lobj.size()-1;i>=0;i--)
       {
        System.out.println(lobj.get(i)+" ");
       }
    }
}
