// Program for Finding Smallest Number in Linked List

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
int Smallest(PNODE head)
{
    int Min = head->data;

    while( head != NULL )
    { 
       if ( head->data < Min )
       {
        Min= head->data;
       }
        head = head->next;
    }
    return Min;
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
    
    iRet = Smallest(first);
    printf("Smallest Number in Linked List  %d",iRet);
    return 0;
}