import java.util.LinkedList;

public class LLCollectionFramework
{
    public static void main(String args[])
    {
        // in which we are not going to use primitive data type
        // we use object of  Correcpinding primitive data type
        // int -> Integer
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        System.out.println(ll);

        //remove
        ll.removeFirst();
        ll.removeLast();
        
        System.out.println(ll);
    }
}