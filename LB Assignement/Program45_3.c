// WRITE A PROGRAM WHICH RETURNS ADDITION OF ALL
// EVEN NUMBER SLL

#include<stdio.h>
#include<stdlib.h>

typedef struct node
{
    int data;
    struct node*next;
}NODE,*PNODE,**PPNODE;

void InsertFirst(PPNODE head,int no)
{
    PNODE newn = NULL;

    newn = (PNODE) malloc (sizeof(NODE));
    newn->data = no;
    newn->next = NULL ;

    if ( *head == NULL )
    {
        *head = newn;
    }
    else
    {
        newn->next = *head;
        *head = newn;
    }
}
int  Display(PNODE head)
{   
    int iSum = 0;
    while( head != NULL)
    {
         if( (head->data) % 2 == 0)
         {
            iSum = iSum + (head->data);
         }
         head = head->next;
    }
    return iSum;
}
int main()
{
    PNODE first = NULL;
    int iRet = 0;

    InsertFirst(&first,34);
    InsertFirst(&first,66);
    InsertFirst(&first,21);

     iRet = Display(first);
     printf("Addition of All Even number isL %d",iRet);
}
