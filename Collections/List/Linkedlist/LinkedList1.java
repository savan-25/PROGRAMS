import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
public class LinkedList1 {
   public static void main(String args[])
   {
    LinkedList<Integer> ll = new LinkedList<>();

    ll.add(2);
    ll.add(3);
    ll.add(4);
    ll.add(5);
    ll.add(6);

    ll.get(2);
    
    System.out.println(ll);

    ll.addFirst(14);
    ll.addLast(25);

    System.out.println(ll);

    System.out.println(ll.getLast());

    ll.remove(2); // by default remove

    System.out.println(ll);

    ll.removeIf(x -> x % 2 == 0);

    System.out.println(ll);


    LinkedList<String> Animal = new LinkedList<>(Arrays.asList("cat","dog","cow"));

    LinkedList<String> animalsTOremove = new LinkedList<>(Arrays.asList("dog","Line"));

   Animal.removeAll(animalsTOremove);

   System.out.println(Animal);


    


   } 
}
