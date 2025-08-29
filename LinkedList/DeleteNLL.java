/* 
 * Delete N Nodes After M Nodes of Linked List
 * 
 * ip: M = 2  N = 3
 * LL : 1 2 3 4 5 6 7 8 9
 * op:
 * LL : 1 2 6 7
 */

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
    public static int iCount ;

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
        //iCount++;
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
    public void DelN(int m,int n) 
    {    
     node curr = head;
     node t = head;
     
     int count;

     while ( curr != null)
     {
        for( count = 1;count<m && curr != null;count++)
       {  curr = curr.next;
       }
   
         if(curr == null )
         return;

         t = curr.next;
         for(count = 1;count<=n && t!= null ; count++ )
           {
            //node temp = t;
            t = t.next;
           }
           curr.next =t;
           curr = t;
     }
    }
}
class DeleteNLL
{
    public static void main(String args[])
    {
       Singlyll lobj = new Singlyll();
       lobj.InsertLast(3);
       lobj.InsertLast(2);
       lobj.InsertLast(34);
       lobj.InsertLast(5);
       lobj.InsertLast(6);
       lobj.InsertLast(33);
       lobj.InsertLast(21);
       
       lobj.Display();
       lobj.DelN(2,2);

       lobj.Display();
    }
}