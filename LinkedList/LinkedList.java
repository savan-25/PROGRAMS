class LinkedList
{   
    public class NODE
    {
        int data;
        NODE next;

        NODE(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static NODE head;
    public static NODE tail;
    public static int iCount = 0;

    public void InsertFirst( int data)
    {
        NODE newn = new NODE(data);

        if( head == null)
        {
            head = tail = newn;
            iCount++;
            return;
        }
        
            newn.next = head;
            head = newn;
        
        iCount++;
    }
    public void InsertLast(int data)
    {
        NODE newn = new NODE(data);

        if ( head == null)
        {
            head = tail = newn;
            iCount++;
            return;
        }
         
       tail.next = newn;
       tail = newn;
       iCount++;

    }
    public void InsertAtPos(int iPos,int data)
    {   
        NODE newn = new NODE(data);
        if( iPos < 0 || iPos > (iCount+1))
        {
            System.out.println("Invalid Position");
            return;
        }
        if( iPos == 0)
        {
            InsertFirst(data);
            return;
        }
        NODE temp = head;
        int i = 0;

        while ( i < iPos-1)
        {
            temp = temp.next;
            i++;
        }
        newn.next = temp.next;
        temp.next = newn;

        iCount++;

        
    }
    public void Display()
    {
        NODE temp = head;

        while ( temp != null)
        {  
            System.out.print(temp.data+"->");
            temp =temp.next;
        }
        System.out.println("null");

    }
    public int Count()
    {
        return iCount;
    }

    
    public int DeleteFirst()
    {
        if( head == null)
        {   
            System.out.println("LL is Empty");
            return -1;
        }
        else if( head.next == null)
        {   
            int val = head.data;
            head = tail = null;
            iCount--;

            return val;
        }
        
        int val = head.data;
        head = head.next;
        iCount--;

        return val;
    }
    public int  DeleteLast()
    {
        if( head == null)
        {   
            System.out.println("LL is Empty");
            return -1;
        }
        else if( head.next == null)
        {   
            int val = head.data;
            head = tail = null;
            iCount--;

            return val;
        }
        
        NODE temp = head;
        while ( temp.next.next != null )
        {
           temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        iCount--;

        return val;

    }
    public int DeleteAtPos(int iPos)
    {
        if( iPos < 0 || iPos > iCount)
        {
            System.out.println("Invalid Position");
            return -1;
        }
        if ( iPos == 0)
        {
            DeleteFirst();
            
        }
        else if( iPos == iCount)
        {
            DeleteLast();
        }
        NODE temp = head ;
        NODE target  =null;
        for( int i = 0;i<iPos-1 ;i++)
        {
           temp = temp.next;
        }
        target = temp.next;
        temp.next = target.next;
        iCount--;
        
        return target.data;
    }
    public int ItSearch(int no)// O(n)
    {
      NODE temp = head;
      int i = 0;
      while ( temp != null)
      {
          if( temp.data == no)
          {
            return i;
          }
          temp = temp.next;
          i++;
      }
      return -1;
    }
    public int RecSearch(NODE head, int key) {
        if (head == null) {
            return -1; // Return -1 if the key is not found
        }
        if (head.data == key) {
            return 0; // Return 0 if the key is found at the current node
        }
        int result = RecSearch(head.next, key);
        if (result == -1) {
            return -1; // If the key is not found in the rest of the list, return -1
        }
        return result + 1; // Increment the result to reflect the position of the key
    }
    
    public void Rervers() // O(n)
    {
        NODE prev = null;
        NODE curr = tail = head;

        NODE next ;
        while ( curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

      head = prev;  // head mera null hua isliye is ko modify kiya
    }

       

    public static void main(String arg[])
    {  
        LinkedList ll = new LinkedList();
        int iRet = 0;

        ll.InsertFirst(1);
        ll.InsertFirst(45);
        ll.InsertFirst(56);
        ll.Display();
        iRet = ll.Count();
        System.out.println("Count of Node is"+iRet);
        


        ll.InsertLast(3);
        ll.InsertLast(77);
        ll.Display();
        iRet = ll.Count();
        System.out.println("Count of Node is"+iRet);

        ll.InsertAtPos(1, 9);
        ll.InsertAtPos(5,999);
        
        ll.Display();
        iRet = ll.Count();
        System.out.println("Count of Node is"+iRet);

        int deletedValue = ll.DeleteFirst(); 
        System.out.println("Deleted Value is: " + deletedValue); 
        ll.Display();

         deletedValue = ll.DeleteLast(); 
        System.out.println("Deleted Value is: " + deletedValue); 
        ll.Display();

        iRet = ll.Count();
        System.out.println("Count of Node is"+iRet);

        deletedValue = ll.DeleteAtPos(4); 
        System.out.println("Deleted Value is: " + deletedValue); 
        ll.Display();

        iRet = ll.Count();
        System.out.println("Count of Node is"+iRet);

        
        System.out.println(iRet);

        ll.Rervers();
        ll.Display();


    }
}