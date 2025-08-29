// check the given Linked list are Palindrome or not
// Steps
// 1. Find out middle of LL ( slow & Fast pointer)
// 2.Reverse 2nd half
// 3.check left data and right data


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
    public node middNode()
    {
        node fast = head;
        node slow = head;

        while ( fast != null && fast.next != null)
        {
            slow = slow.next ; //+1
            fast = fast.next.next; //+2
        }
        return slow; // slow is now at Middle Position
    }

    public Boolean CheckPalindrome()
    {   
        // step 1 LL is Empty or not

        if( head == null || head.next == null )
        {
            return true;
        }
        // step 1 Find mid
        node mid = middNode();

        // step 2 Reverse 2nd half
        node prev = null;
        node curr = mid ;
        node next;

        while( curr != null )
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node right = prev;// right healf head
        node left = head; // original head

        // step 4 check left & right half

        while( right != null )
        {
            if( left.data != right.data)
            {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
}
public class LLPalindrome
{
    public static void main(String args[])
    {
        Singlyll lobj = new Singlyll();

        lobj.InsertLast(1);
        lobj.InsertLast(2);
        lobj.InsertLast(2);
        lobj.InsertLast(1);
       
       

        lobj.Display();
      boolean iRet = lobj.CheckPalindrome();
      System.out.println(iRet);


       

    }
}