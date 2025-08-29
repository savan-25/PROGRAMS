// WRITE A PROGRAM WHICH REVERSE ALL ELEMENTS OF SINGLY LINKED LIST

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
void Reverse(PNODE head)
{   int iDigit  = 0;
   while( head != NULL ){
    printf("|");
    while ( head->data != 0 )
    {   
        iDigit = head->data % 10;
        printf("%d",iDigit);
        head->data = head->data / 10;
    }
    printf("|->");
    head = head->next;
   }
}
int main()
{   
    PNODE first = NULL;
    int iRet = 0;
    InsertFirst(&first,40);
    InsertFirst(&first,30);
    InsertFirst(&first,20);
    InsertFirst(&first,10);
   
    Reverse(first);
   
}