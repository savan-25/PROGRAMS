class node
{
    int data;
    node next;
    node prev;

    public node(int no)
    {
        this.data = no;
        this.next = null;
        this.prev = null;

    }
}
class doublyLL
{
    public node head;
    int iCount;

    public doublyLL()
    {
        this.head = null;
        iCount = 0;
    }

    public void InsertFirst(int no)
    {
        node newn = new node(no);

        if( head == null )
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
    public void InsertLast(int no)
    {
        node newn = new node(no);

        if( head ==null )
        {
            head = newn;
        }
        else
        {
            node temp = head;

            while( temp.next != null )
            {
                temp =temp.next;
            }
            temp.next = newn;
            newn.prev = temp;
        }
    }
    public int DeletetLast()
    {   
        int ret;
        if( head == null )
        {
            return -1;
        }
        else if( head.next == null)
        {
            ret = head.data;
            head = null;   
        }
        else 
        {
            node temp = head;
            while( temp.next.next != null )
            {
                temp = temp.next;
            }
            ret = temp.next.data;
            temp.next = null;
        }
        return ret;
    }
    public void Display()
    {
        node temp = head;

        System.out.println("Element of Linked list: ");
        while( temp != null )
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }

}
class DLinkedList
{
    public static void main(String args[])
    {
      doublyLL dobj = new doublyLL();

      dobj.InsertFirst(14);
      dobj.InsertFirst(25);
      dobj.Display();

      dobj.InsertLast(33);
      dobj.InsertLast(99);
      dobj.Display();

      int iRet = dobj.DeletetLast();
      System.out.println("deleted Element is :"+iRet);
      dobj.Display();
    }
}