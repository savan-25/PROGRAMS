import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
import java.util.List;

public class CopyonWritearrayList {
    public static void main(String[] args) {
        
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        // "Copy on Write " means that whenever a write operation
        // like adding or removing an element
        // instead of directly modifying the existing list
        // a new copy of list get created ,and the modification is applied to copy
        // this ensure the other thread reading the list while its being modified or unaffected

        // Read : fast and direct
        // Write : a new copy of the list is created for every modification
        //the reference to the list is then updated so that subsequent reads use this new list
        
        // noteapd -- notes

        // read more

        List<String> shoppinglist = new CopyOnWriteArrayList<>();

        shoppinglist.add("Milk");
        shoppinglist.add("egg");
        shoppinglist.add("Bread");
        shoppinglist.add("Butter");
        shoppinglist.add("Banana");

        System.out.println("initial Shopping list is:"+shoppinglist);

        for(String item : shoppinglist)
        {
            System.out.println(item);

            // try to modify

            if(item.equals("Butter"))
            {
                shoppinglist.add("Apple");
                System.out.println("Adding butter while reading");
            }
        }
        System.out.println("Updated Shopping list : "+shoppinglist);
    }
}
