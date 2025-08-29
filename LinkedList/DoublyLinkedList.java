class node 
{
  int data;
  node next;
  node prev;
  
  public node(int x)
  {
    this.data = x;
    this.prev = null;
    this.next = null;
  }
}

class DoublyLL
{
    node head ;
    int iCount;

    DoublyLL()
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
            newn.prev = head;
        }
        iCount++;
    }
    public void InsertLast(int iNo)
    {
        node newn = new node(iNo);

        if(head == null)
        {
            head = newn;
        }
        else
        {
            node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newn;
            newn.prev = temp;
        }
        iCount++;
        
    }
    public void InsertAtpos(int ipos,int iNo)
    {   
        if(ipos < 0 || ipos > iCount+1)
        {
            System.out.println("Invalid Position :");
        }
        node newn = new node(iNo);

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
    public int CountNode()
    {
        return iCount;
    }

}
public class DoublyLinkedList {
    public static void main(String[] args) {

        DoublyLL dobj  = new DoublyLL();
        int Count = 0;

        dobj.InsertFirst(10);
        dobj.InsertFirst(9);
        dobj.InsertFirst(8);

        dobj.Display();

        dobj.InsertLast(56);
        dobj.Display();

        Count = dobj.CountNode();
        System.out.println("Count of Node is:"+Count);

        
    }
}
