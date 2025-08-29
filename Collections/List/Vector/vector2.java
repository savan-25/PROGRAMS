// ager isko thread safe karan hai to vector ka use karana padega
import java.util.ArrayList;
import java.util.Vector;
public class vector2 {
    public static void main(String[] args) {
        
        Vector<Integer> lobj = new Vector<>();

        Thread t1 = new Thread(()->
        {
            for(int i=0;i<500;i++)
            {
                lobj.add(i);
            }

        });

        
        Thread t2 = new Thread(()->
        {
            for(int i=0;i<500;i++)
            {
                lobj.add(i);
            }

        });


     t1.start();
     t2.start();

     try{
        t1.join();
        t2.join();
     }catch(InterruptedException e)
     {
        e.printStackTrace();
     }

     System.out.println("Size of list is: "+lobj.size());
    }    
}
