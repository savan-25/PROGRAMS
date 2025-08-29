// Implementation of Doubley LL  

#include<iostream>
using namespace std;

typedef struct node
{
    int data;
    struct node*  next;
    struct node* prev;
}NODE,*PNODE;

class doublyll
{
    public:
    PNODE head ;
    int iCount ;

    doublyll()
    {
        head = NULL;
        iCount = 0;
    }

    void InsertFirst(int no);
    void InsertLast(int no);
    void InsertAtPos(int iPos,int no);
    void DeleteFirst();
    void DeleteLast();
    void DeleteAtPos(int iPos);
    void Display();
    int Count();
};
void doublyll :: InsertFirst(int no)
{
    PNODE newn = NULL;

    newn = new NODE;
    newn->data = no;
    newn->next = NULL;
    newn->prev = NULL;

    if( head == NULL )
    {
        head = newn;
    }
    else
    {    
        newn->next = head;
        head = newn;

        newn->prev = head;
    }
    iCount++;
}
void doublyll :: InsertLast(int no)
{
    PNODE newn = NULL;
    newn = new NODE;
    newn->data = no;
    newn->next = NULL;
    newn->prev = NULL;

    if( head == NULL )
    {
        head = newn;
    }
    else
    {
        PNODE temp = head;
        while( temp->next != NULL)
        {
            temp = temp->next;
        }
        newn->prev = temp;
        temp->next = newn;
        
    }
    iCount++;
}
void doublyll :: InsertAtPos(int iPos,int no)
{
    if ( iPos < 0 || iPos > iCount+1)
    {
        cout<<"Invalid Position:\n";
        return;
    }
    if( iPos == 0)
    {
        InsertFirst(no);
    }
    else
    {
      PNODE newn = NULL;
      newn = new NODE;
      
      newn->data = no;
      newn->next = NULL;
      newn->prev = NULL;

      PNODE temp = head;

      for ( int i=1;i<iPos-1;i++)
      {
         temp = temp->next;
      }
      newn->prev = temp;
      newn->next = temp->next;
      
       temp->next = newn;
       newn->next->prev = newn;
       
       iCount++;
    }
}
void doublyll :: DeleteFirst()
{
    if ( head == NULL )
    {
        return;
    }
    else if ( head->next == NULL )
    {
        delete head ;

        head = NULL;
    }
    else
    {
       PNODE temp = head;
       head = head->next;

       head->prev = head;

       delete temp;

    }
    iCount--;

}
void doublyll :: DeleteLast()
{
    
    if ( head == NULL )
    {
        return;
    }
    else if ( head->next == NULL )
    {
        delete head ;

        head = NULL;
    }
    else
    {  
        PNODE temp = head;
        while ( temp->next->next != NULL)
        {
           temp = temp->next;
        }
        delete(temp->next);
        temp->next = NULL;
    }
    iCount--;
}
void doublyll :: DeleteAtPos(int iPos)
{
    if( iPos < 1 || iPos > iCount)
    {
          cout<<"Invalid Position\n";
          return;
    }
    if( iPos == 1)
    {
        DeleteFirst();
    }
    else
    {
        PNODE temp = head;
        PNODE target = NULL;

        for( int i = 1;i<iPos-1;i++)
        {
            temp = temp->next;
        }
        target = temp->next;
        temp->next = target->next;

        temp->next->prev = temp;

        delete target;

        iCount--;

    }
}
void doublyll :: Display()
{
    PNODE temp = head;
    
    cout<<"Elements of Linked List:";
    while ( temp != NULL)
    {
        cout<<temp->data<<"->";
        temp = temp->next;
    }
    cout<<"\n";
}
int doublyll :: Count()
{
    return iCount;
}
int main()
{   
    doublyll dObj;
    
    dObj.InsertFirst(45);
    dObj.InsertFirst(40);
    dObj.Display();

    dObj.InsertLast(89);
    dObj.InsertLast(14);
    dObj.Display();
   
   
    dObj.DeleteFirst();
    dObj.Display();
     int iRet = dObj.Count();
   cout<<"Count of Node is:"<<iRet<<"\n";

    dObj.DeleteLast();
    dObj.Display();
     iRet = dObj.Count();
   cout<<"Count of Node is:"<<iRet<<"\n";

  
  dObj.DeleteAtPos(2);
    dObj.Display();
     iRet = dObj.Count();
   cout<<"Count of Node is:"<<iRet<<"\n";

  

  


    return 0;
}