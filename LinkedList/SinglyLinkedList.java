class node
{
   int data;
   node next;

   public node(int x)
   {
    data = x;
    next = null;
   }
}
class SinglyLL
{  
    node head;
    int iCount;

    SinglyLL()
    {
      head = null;
      iCount = 0;
    }

    public void InsertFirst(int iNo)
    {
        node newn = new node(iNo);
        
        if(head == null)
        {
            head = newn;
        }
        else
        {
            newn.next = head;
            head = newn;
        }
        iCount++;
    }
    public void InsertLast(int iNo)
    {
        node newn = new node(iNo);

        if(head == null)
        {
            head  = newn;
        }
        else
        {
            node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newn;
        }
        iCount++;
    }
    public void InsertAtPos(int iPos,int iNo)
    {
        if(iPos < 0 || iPos > iCount+1)
        {
            System.out.println("Invalid Position");
            return;
        }
        if(iPos == 1)
        {
            InsertFirst(iNo);
        }
        else if(iPos == iCount+1)
        {
            InsertLast(iNo);
        }
        else 
        {  
            node newn = new node(iNo);
            node temp = head;
            for(int i=1;i<iPos-1;i++)
            {
                temp = temp.next;
            }
            newn.next = temp.next;
            temp.next = newn;
        }

    }
    public int DeleteFirst()
    {   
        int temp = 0;
        if(head == null)
        {
            return 0;
        }
        else if(head.next == null)
        { 
          temp = head.data;
          head = null;

          System.gc();
        }
        else
        {
            temp = head.data;
            head = head.next;
            
        }

        iCount--;
         return temp;
    }
    public int DeleteLast()
    { 
        int temp = 0;
        if(head == null)
        {
           return 0;
        }
        else if(head.next == null)
        {
            temp = head.data;
            head = null;
            System.gc();
        }
        else 
        {
            node Itr = head;
            while(Itr.next.next != null)
            {
                Itr = Itr.next;
            }
            temp = Itr.next.data;
            Itr.next = null;
        }
        iCount--;
        return temp;
    }
    public int DeleteAtPos(int iPos)
    {  
        int temp = 0;

        if(iPos < 0 || iPos > iCount+1)
        {
           System.out.println("Invalid Position");
           return 0;
        }
        if(iPos == 1)
        {
            DeleteLast();
        }
        else if(iPos == iCount)
        {
            DeleteLast();
        }
        else 
        {
            node Itr = head;
            node target;
            for(int i=1;i<iPos-1;i++)
            {
                Itr = Itr.next;
            }
            temp = Itr.next.data;
            Itr.next = Itr.next.next;
            iCount--;

        }
        return temp;
    }
    public void Display()
    {
        node temp = head;
        while(temp != null)
        {
            System.out.print("|"+temp.data+"|->");
            temp = temp.next;
        }
        System.out.println();
    }
    public void DeleteElement(int val)
    {  
         while(head != null && head.data == val)
       {
           head = head.next;
       }
       if(head == null)
       {
        return;
       }
            node current = head;
       while(current.next != null)
       {
        if(current.next.data == val)
        {
            current.next = current.next.next;
        }
        else{
        current = current.next;
        }

       }
    }
    public void RotateLL()
    {   
        
        if(head == null || head.next == null)
        {
            return;
        }
        node temp = head;

        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        node last = temp.next;
        temp.next = null;

        last.next = head;
        head = last;
    }

    // Rotate LL by d Place 
    // means input [1,2,3,4,5]   k=2
    // Output [4,5,1,2,3]

    public void RotateLLk(int k)
    {
       // Check there is a Single Element ,LL is null or k ==0
       if(head == null|| head.next == null || k == 0)
       {
        return;
       }

       //find out the Length of LL
       int iLength = 1;
       node temp = head;
       while (temp.next != null) {
        temp = temp.next;
        iLength++;
       }

       // if k is greater than length then it generate unnecessary interation
       // so use
       k = k % iLength;
       int skipList = iLength - k;

       // Make a Linked List Circular
        node newTail = head;
       temp.next = head;
      
       for(int i=1;i<skipList;i++)
       {
        newTail = newTail.next;
       }
       // Then assign new head

       head = newTail.next;

       // break the Circular LL
       newTail.next = null;

    }

}
public class SinglyLinkedList {
    public static void main(String[] args) {
        SinglyLL sobj = new SinglyLL();

        sobj.InsertLast(1);
         sobj.InsertLast(2);
         sobj.InsertLast(3);
         sobj.InsertLast(4);
         sobj.InsertLast(5);

        sobj.Display();

        // sobj.DeleteElement(3);
          //sobj.RotateLL();
         sobj.Display();
         sobj.RotateLLk(2);

         sobj.Display();
        
    }
}
