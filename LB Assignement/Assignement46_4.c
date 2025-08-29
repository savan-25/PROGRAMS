// WRITE A PROGRAM WHICH DISPLAY Smallest Digit of All element from Singly
// linked list

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
void DisplaySmall(PNODE head)
{   
    while (  head != NULL )
    {
        int iDigit  = 0;
        int iSmall = 99999;
  
    while ( head->data > 0 )
    {   
        iDigit = head->data % 10;
        if ( iDigit < iSmall)
        {
            iSmall = iDigit;
        }
        head->data = head->data / 10;
    }
    printf("%d\t",iSmall);
    head= head->next;
    }
}
int main()
{   
    PNODE first = NULL;
    int iRet = 0;
    InsertFirst(&first,49);
    InsertFirst(&first,30);
    InsertFirst(&first,291);
    InsertFirst(&first,10);
   
    DisplaySmall(first);
   
}