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
      cout<<"NULL";
    }
     void Even()
    {  
       PNODE end  = NULL;
       PNODE p = head;
       PNODE temp = head;

       while( temp != NULL )
       { 
        
         temp = temp->next;
         if( (temp->data) % 2 == 0 && head != NULL)
         {
          p->next = temp->next;
          temp->next = p;

          p = p->next;

         }

       }
       return;

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
    lobj.Even();
    lobj.Display();
}