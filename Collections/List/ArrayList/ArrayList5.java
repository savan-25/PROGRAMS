// Sorting an Array list
// Collections ----> class  (s)   
// Collection ------> interface
// sort ke liye --> Collections --> sort in asending order
// min ,max are static method  from collections class

import java.util.ArrayList;
import java.util.Collections;
class ArrayList5
{
        public static void main(String[] args) 
    {
        ArrayList<Integer> lobj = new ArrayList<>();

        lobj.add(11);
        lobj.add(21);
        lobj.add(31);
        lobj.add(10);
        lobj.add(111);

        System.out.println(lobj);
        //Asending
        Collections.sort(lobj);
        System.out.println(lobj);
        
        //decending
        Collections.sort(lobj,Collections.reverseOrder());
        // comparator function list
        System.out.println(lobj);

        //using Collection iterface
        lobj.sort(null);
        System.out.println(lobj);

        //
    }  
    /*
     * import java.util.ArrayList;
class Practice
{  
 
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        

        // new varient of for loop
        list.forEach((element)->
        {
            System.out.println(element);
        });


    }
}
     */
}

