// Implementation of Queue using Linked list
// queue follow LIFO(Last in First Out)
class node
{
    int data;
    node next;

    public node(int X)
    {
        this.data = X;
        this.next = null;
    }
}
class Queue1
{
    public node head;
    public int iCount;

    Queue1()
    {
        this.head = null;
        this.iCount = 0;
    }

    public void enqueue(int no) // adding Element in the queue from back 
    {
       node newn = new node(no);

       if( head == null )
       {
        head = newn;
       }
       else
       {
        node temp = head;

        while(temp.next != null )
        {
            temp = temp.next;
        }
        temp.next = newn;
        iCount++;
       }

    }
    public int Dequeue()
    {      
             // delete element from front of queue
             int data = 0;
        if( head == null )
        {  
            System.out.println("Queue is Empty");
            return -1;
        }
        else if( head.next == null )
        {   
            data = head.data;
            head = null;
            System.gc();
        }
        else
        {
            data = head.data;
            head = head.next;

            System.gc();
        }
        return data;
    }

    public void Display()
    {  
        
        node temp = head;
        
        if( head == null )
        {
          System.out.println("Queue is Empty");
          return;
        }
        while( temp != null )
        {  
            System.out.print(temp.data+"\t");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class Queue {
    public static void main(String args[])
    {
           Queue1 qobj = new Queue1();
           qobj.enqueue(14);
           qobj.enqueue(45);
           qobj.enqueue(25);

           qobj.enqueue(18);
           qobj.enqueue(23);



           qobj.Display();

           qobj.Dequeue();
           qobj.Dequeue();
           qobj.Dequeue();
           qobj.Dequeue();
          
           qobj.Display();

    }
}
