// it is part of collection and implements list interface
//Linked list is linear data sstructre where each element separate object\
//called node,contains two part 
// internally use doubley linked list
//bettr insertion and deletion than arraylist not require shifting of element
// Random access is takes more time
//it has memeory overhead -> requires more memory data and pointer

import java.util.LinkedList;
public class LinkedList2 {
    public static void main(String args[])
    {
        LinkedList<Integer> lobj = new LinkedList<>();

        lobj.addLast(1);
        lobj.addLast(2);
        lobj.addLast(3);
        lobj.addLast(4);

        // How to get First element of ll
        System.out.println("First Element =>"+lobj.getFirst());

        //how to get last Element of Ll
        System.out.println("Last Element =>"+lobj.getLast());

        // how to get element at given index in LinkedList

        System.out.println("Element at 3 position :"+lobj.get(3));

        // How to get all the element of Linked List
        System.out.println(lobj);

        // we also use remove ,removelast removefirst
    
        System.out.println(lobj.remove());
    }
    
}
