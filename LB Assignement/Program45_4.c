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
int SecMaximum(PNODE head)
{
    int SecMax =-999;
    int Max  = -999;

    while ( (head) != NULL )
    {   
        if ( head->data > SecMax)
        {
            SecMax = head->data;
        }
        if ( head->data > Max)
        {
            SecMax = Max;
            Max = head->data;
        }
        head = head->next;
    }
    return SecMax;
}
int main()
{
    PNODE first = NULL;
    int iRet = 0;

    InsertFirst(&first,34);
    InsertFirst(&first,66);
    InsertFirst(&first,21);
    InsertFirst(&first,77);
    InsertFirst(&first,76);

     iRet = SecMaximum(first);
     printf("Second Maximum Number in Linked List are: %d",iRet);
}
