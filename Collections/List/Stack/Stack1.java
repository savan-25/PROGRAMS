
//Stack extends from vector making thread safe
import java.util.Stack;
import java.util.LinkedList;
import java.util.ArrayList;
class Stack1
{
    public static void main(String[] args) 
    {
        Stack<Integer> sobj = new Stack<>();

        sobj.push(1);
        
        sobj.push(2);
        
        sobj.push(3);
        
        sobj.push(4);
        
        sobj.push(5);

        System.out.println(sobj);

        Integer removeElemen = sobj.pop();

        System.out.println(sobj);


        System.out.println(sobj.peek());

        // 
        System.out.println(sobj.isEmpty());

        //Searching -> indexing start from 1

        int search = sobj.search(3);
        System.out.println(search);

    

        // Linked list as stack

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);;
        linkedList.addLast(4);

        linkedList.getLast(); // peek
        linkedList.removeLast();
        linkedList.size();
        linkedList.isEmpty();
        

        //arraylista as stak

        ArrayList<Integer> aobj = new ArrayList<>();

        aobj.add(1);
        aobj.add(2);

        aobj.get(aobj.size()-1);//peek
        aobj.remove(aobj.size()-1); // pop



        
    }
}
/*
 * Array list - sequential O(1)
 * Linked List - Insertion and deletion
 * vector  - synchronization
 */

 /*  it is sunclass of vector ,means which inherits all
  features of dynamic array ,
  but it constrained with LIFO nature
  * 
  */