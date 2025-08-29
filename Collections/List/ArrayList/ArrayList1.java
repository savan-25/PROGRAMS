import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>(1000); // Default  capicity 10
    //     // we can also set size explicitly
    //     // there is no method to chek capicty
    //     list.add(1);
    //     list.add(10);
    //     list.add(21);
    //     list.add(51);

        
    //     list.add(2,50);
    //    System.out.println(list.size());
        // for(int x: list)
        // {
        //     System.out.println(x);
        // }
        // System.out.println(list);
        // System.out.println(list.get(2));

        // for(int i=0;i<list.size();i++)
        // {
        //     System.out.println(list.get(i));
        // }

        // for(int x : list)
        // {
        //     System.out.println(x);
        // }

        // System.out.println(list.contains(56));

     
    /*     Method of creation array
    Arrays are different than Array list 
     *  Array List have dynamic Size but Arrays have fixed Size
     * 
     * Ex:
     * List<String> list1 = Arrays.asList("Monday" , "Tuesday")
     *   List<Integer>
     * 
     *  List<Integer> list1 = new Array
     * 
               Array                        ArrayList
        Fixed Size                           Dynamic Size
        primitive data types can be stored    cant stroed directly
        
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList - name of collection
        Interger - type of Collection
        list  - object or name of list
        new =-  new Keyword creates memeory space in heap Section
        ()  - call the constructor 
          <> - for specifying data type

          
         
        */  

        // add  o(n)
        list.add(334);
        
        // get Element o(1)
        list.get(1);

        //Remove Element o(n)
        list.remove(1);

        // Set Element at index  o(n)

        list.set(1,34);

        //containts Elements  
        list.contains(12);

        // we not use Arr[i]

        // Size of Al  

        System.out.println(  list.size());

        // print the Arraylist

        for(int i = 0;i<list.size();i++)
        {
            System.out.println(list.get(i) + " ");
        }


    }
}
/*
  how to check arraylist is empty using the isEmpty() method
  how to find the size of an arraylist using size() method
  how to access element at particular index using get() method
  how to modify element at particulat index using set() method
  
 */
