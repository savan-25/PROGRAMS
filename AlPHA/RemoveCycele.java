class node
{
    public int data;
    public node next;

    public node(int x)
    {
        data = x;
        next = null;
    }  
}
class Singlyll
{
    public node head;
    public int iCount ;

    Singlyll()
    {
        head = null;
        iCount = 0;
    }
    public void InsertLast(int no)
    {
        node newn = new node(no);

        if( head == null )
        {
            head = newn;
        }
        else
        {
            node temp = head;
            while( temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newn;
        }
    }
    public void Display()
    {
        node temp = head;

        while( temp != null )
        {
            System.out.print(temp.data+" ");
            temp =temp.next;
        }
        System.out.println("");
    }
    public boolean CheckCycle()
    {   
        boolean bRet = false;
        node slow = head;
        node fast = head;

        while ( fast != null && fast.next != null )
        {
            slow = slow.next;
            fast = fast.next.next;

            if( slow == fast )
            {
                bRet = true;
                break;
            }
        }
        return bRet;
    }
    public void RCycle()
    {
        // detect 
        boolean bRet = false;
        node slow = head;
        node fast = head;

        while ( fast != null && fast.next != null )
        {
            slow = slow.next;
            fast = fast.next.next;

            if( slow == fast )
            {
                bRet = true;
                break;
            }
        }
        if( bRet == false)
        {
            return ;
        }

       slow  = head;
       node prev = null;

       while( slow != fast )
       {
           slow = slow.next;
           prev = fast;
           fast = fast.next;

           if( slow == fast)
           {
            prev.next = null;
           }
       }
      
    }
  
}
class RemoveCycele
{
     public static void main(String args[])
     { 
        Singlyll lobj = new Singlyll();

        lobj.head = new node(1);
        lobj.head.next = new node(2);
        lobj.head.next.next = new node(3);
        lobj.head.next.next.next = lobj.head; // should print true

        System.out.println(lobj.CheckCycle());
        lobj.RCycle();
        System.out.println(lobj.CheckCycle());


         
    }
}