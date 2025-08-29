import java.util.Vector;
import java.util.LinkedList;

public class Vector1 {
    public static void main(String[] args) {
        
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);

        System.out.println(vector.capacity());// 10
         vector.add(1);
          
         vector.add(12);
         
         for(int x : vector)
         {
            System.out.print(x+"\t");
         }
         for(int i=0;i<vector.size();i++)
         {
            System.out.print(vector.get(i));
         }

    }
}

/*
     Methods in Vector

     add(Element): Adds an Element at the end 
     add(int indx,E element) : Insert Element at specified index
     get(int index ) : Retrive the element at specified location
     set(int indx,E element) : Replace element at Specified Locations
      move(object o) : remove first occurence of the specified index
     size():
     isEmpty() : checks vector is Empty
     contains(object o) : check for specific element
     clear() : remove all element 
     toString() : return String representation of this vector
     toArray() : Return an array containnin all the element in vector
     trimToSize() : Trims the capacity of this vector to be vector current size

 */
/*      Synchronize
      it ensure that only one thread can access the vector at time
      this make it thread safe ,but overhead in single-thread environemnt


      
 */