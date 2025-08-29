// WRITE A PROGRAM WHICH DISPLAY ALL PALINDROE ELEMENT OF SINGLY
// LINKED LIST

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
void DisplayPalindrome(PNODE head)
{   
    while ( head != NULL )
    {
        
    }
}
int main()
{   
    PNODE first = NULL;
    int iRet = 0;
    InsertFirst(&first,490);
    InsertFirst(&first,30);
    InsertFirst(&first,29);
    InsertFirst(&first,10);
   
    DisplayProduct(first);
   
}