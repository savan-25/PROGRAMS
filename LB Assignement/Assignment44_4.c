// Program for Finding Largest Number in Linked List

#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node* next;
};
typedef struct node NODE;
typedef struct node* PNODE;
typedef struct node** PPNODE;

void InsertFirst(PPNODE head,int no)
{
    PNODE newn = NULL;

    newn = (PNODE) malloc (sizeof(NODE));

    newn->data = no;
    newn->next = NULL;

    if( *head == NULL)
    {
        *head = newn;
    }
    else
    {
        newn->next = *head;
        *head  = newn;
    }
}
int Largest(PNODE head)
{
    int Max = head->data;

    while( head != NULL )
    { 
       if ( head->data > Max )
       {
        Max = head->data;
       }
        head = head->next;
    }
    return Max;
}
int main()
{   
    PNODE first = NULL;
    int iRet = 0;
    InsertFirst(&first,30);
    InsertFirst(&first,60);
    InsertFirst(&first,50);
    InsertFirst(&first,10);
     InsertFirst(&first,30);
    InsertFirst(&first,10);
    InsertFirst(&first,10);
    InsertFirst(&first,90);
    
    iRet = Largest(first);
    printf("Maximum Number in Linked List  %d",iRet);
    return 0;
}