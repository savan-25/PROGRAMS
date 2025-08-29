// WRITE A PROGRAM WHICH DISPLAY Smallest Digit of All element from Singly
// linked list

#include <iostream>
using namespace std;

typedef struct node
{
    int data;
    struct node *next;
} NODE, *PNODE;

class Singlyll
{     
    public: 
    PNODE head;
    int data;

    Singlyll()
    {
        head = NULL;
        data = 0;
    }
    void InsertFirst(int no)
    {
        PNODE newn = NULL;

        newn = (PNODE)malloc(sizeof(NODE));

        newn->data = no;
        newn->next = NULL;

        if ( head == NULL)
        {
            head = newn;
        }
        else
        {
            newn->next = head;
            head = newn;
        }
    }
    void Display()
    {
      PNODE temp = head;

      while( temp != NULL )
      {  
        cout<<"|"<<temp->data<<"|->";
        temp = temp->next;
      }
      cout<<"\n";
    }
    void Revrese(int n,int m)
    {
        PNODE p = head;
        PNODE q = head;

        int iCount = 0;

        while ( p!= NULL )
        {
            for(iCount = 1;iCount<m;iCount++)
            {
                p = p->next;
            }

            if( p == NULL )
            {
                return;
            }
            q = p->next;
            for(iCount = 1;iCount<=n;iCount++)
            {
                q = q->next;
            }
             p->next = q;
            p = q;
        }

    }
 
};
int main()
{  
    Singlyll lobj;

    PNODE first = NULL;
    int iRet = 0;
    
    lobj.InsertFirst( 49);
    lobj. InsertFirst(30);
    lobj.InsertFirst(10);
    lobj.InsertFirst( 291);
    

    lobj.Display();
    lobj.Revrese(1,1);
    lobj.Display();
}