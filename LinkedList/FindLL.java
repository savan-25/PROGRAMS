// Find & Remove Nth node from End
public class FindLL {
    class NODE
    {
        int data;
        NODE next;

        NODE(int no)
        {
            this.data = no;
            this.next = null;
        }
    }
    public static NODE head;
    public static NODE tail;
    public static int iCount = 0;
    void InsertLast(int no)
    {
        NODE newn = new NODE(no);

        if( head == null){
           head = tail = newn;
        }
        
        tail.next = newn;
        tail = newn;
        iCount ++;
    }
    void Display()
    {
        NODE temp = head;
        System.out.println("Elements of Linked List");
        while( temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public void deleteNthNodefromEnd(int n)
    {
        int iSize = 0;
        NODE temp = head;

        while ( temp != null)
        {
            temp = temp.next;
            iSize++;

        }
        if( n == iSize) // head ko delete karana hai
        {
            head = head.next;
            return;
        }
        // Size -n tak jana hai;
        int i =1;
        int iToFind = iSize - n;
        temp = head;
        for( i = 1;i<iToFind;i++)
        {
           temp = temp.next;
        } 
        temp.next = temp.next.next;
        System.gc();
    }
    
    public static void main(String args[])
    {
        FindLL lobj = new FindLL();
        lobj.InsertLast(45);
        lobj.InsertLast(14);
        lobj.InsertLast(77);
        lobj.InsertLast(56);
        lobj.InsertLast(332);

        lobj.Display();

        lobj.deleteNthNodefromEnd(3);
        lobj.Display();
        
    }
}
