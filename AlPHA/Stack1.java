// Push the item at Bottom of the Stack

// Implementation of stack using Linked List
class node
{
   int data;
   node next;

   public node(int x)
   {
    data= x;
    next = null;
   }
}
class StackLL
{
    public node head;
    public int iCount;
    
    public StackLL()
    {
        this.head = null;
        this.iCount = 0;
    }
   
    public void push(int no)// InsertFirst
    {
      node newn = new node(no);
     
      if( head == null )
      {
        head =  newn;
        
      }
      else
      {
        newn.next = head;
        head = newn;  
      }
    }
    public void Display()
    {   
        node temp = head;
        while( temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public int pop()
    {
        int top;
        
        if( head == null)
        {
            return -1;
        }
       top = head.data;
       head = head.next;

        return top;
    }
    boolean isEmpty()
    {
        return head == null;
    }
    public void pushAtBottom(int no)
    {
        if(isEmpty())
        {
            push(no);
        }
        else
        {
            StackLL temp = new StackLL();
  
            while(!isEmpty())
            {
                temp.push(pop());
            
            }
            push(no);
            while(!temp.isEmpty())
            {
                push(temp.pop());
                
            }
        }
    }


}
public class Stack1 {
    public static void main(String args[])
    {
        StackLL lobj = new StackLL();

        lobj.push(2);
        lobj.push(3);
        lobj.push(4);

        lobj.Display();
        System.out.println(" Poping top Element");
        System.out.println(lobj.pop());
        System.out.println("After poping");
        lobj.Display();

        System.out.println("Adding element at bottom of LL");
        lobj.pushAtBottom(999);
        lobj.Display();

    }
}
