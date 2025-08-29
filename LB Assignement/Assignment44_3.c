// PROGRAM FOR ADDITION OF ALL ELEMENT IN ARRAY

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
int Addition(PNODE head)
{   int iSum = 0;
    while ( head != NULL )
    {
        iSum = iSum+(head->data);
        head = head->next;
    }
    return iSum;
}
int main()
{   
    PNODE first = NULL;
    int iRet = 0;
    InsertFirst(&first,40);
    InsertFirst(&first,30);
    InsertFirst(&first,20);
    InsertFirst(&first,10);
   
    
    iRet = Addition(first);
    printf("Addition of all Element in Arrayis  %d",iRet);
    return 0;
}