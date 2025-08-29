// Implementation of Singly Circular Linked List in Java
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
class CircularCL
{
    public node head ;
    public node tail;
    public int iCount;

    public CircularCL()
    {
        this.head = null;
        this.tail = null;

        this.iCount = 0;
    }
    public void InsertFirst(int no)
    {
        node newn = new node(no);

        if( head == null && tail == null )
        {
            head = newn;
            tail = newn;
        }
        else
        {
            newn.next = head;
            head = newn;
        }
        tail.next = head;
        iCount++;

    }
    public void InsertLast(int no)
    {    
        node newn = new node(no);

        if( head == null && tail == null )
        {
            head = newn;
            tail = newn;
        }
        else
        {
            tail.next = newn;
            tail = newn;

          
        }
       tail.next = head;
        iCount++;
    }
    public void InsertAtPos(int iPos,int no) 
    {
        node newn = new node(no);

        if( iPos < 0 || iPos > iCount+1 )
        {
            System.out.println("Invalid Position");
            return ;
        }

       if(iPos == 0)
       {
        InsertFirst(no);
       }
       else if( iPos == iCount+1)
       {
        InsertLast(no);
       }
       else
       {
        node temp = head;

        for( int i =0 ;i<iPos-1;i++)
        {
            temp = temp.next;

        }
        newn.next = temp.next;
        temp.next = newn;

        iCount++;
       }
        
    }
    public void Display()
    {   
        node temp = head;
        if( head == null && tail == null)
        {
            System.out.println("LL is Empty");
            return;
        }
        System.out.println("Elements of LL is");
        do
        {
            System.out.print(temp.data+"\t");
            temp = temp.next;
        }while( temp != tail.next);
        System.out.println();
    }
    public int Count()
    {
        return iCount;
    }



}

public class CirularLL {
    public static void main(String args[])
    {
       CircularCL cobj = new CircularCL();

       cobj.InsertFirst(34);
       cobj.InsertFirst(14);
       cobj.InsertFirst(45);
       cobj.Display();
       
       cobj.InsertLast(333);
       cobj.InsertAtPos(3,4 );
       cobj.Display();

       int iRet = cobj.Count();
       System.out.println("Count of Element is:"+iRet);
    }
}
