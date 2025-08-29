
public class ReverseLL {
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
    void InsertLast(int no)
    {
        NODE newn = new NODE(no);

        if( head == null){
           head = tail = newn;
        }
        
        tail.next = newn;
        tail = newn;
    }
    void Display()
    {
        NODE temp = head;

        while( temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    void LReverse()
    {
        NODE prev = null;
        NODE curr = head;
        NODE next;

        while( curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String args[])
    {
        ReverseLL lobj = new ReverseLL();
        lobj.InsertLast(45);
        lobj.InsertLast(14);
        lobj.LReverse();
        lobj.Display();
    }
}
