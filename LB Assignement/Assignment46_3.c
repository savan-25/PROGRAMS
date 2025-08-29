// WRITE A PROGRAM WHICH DISPLAY PRODUCT EACH ELEMENT IN LIKED LIST
// |12|32|20|89|   2 6 0 72

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
void DisplayProduct(PNODE head)
{   
    while (  head != NULL )
    {
        int iDigit  = 0;
        int product = 1;
  
    while ( head->data > 0 )
    {   
        iDigit = head->data % 10;
        product = iDigit*product;
        head->data = head->data / 10;
    }
    printf("%d\t",product);
    head= head->next;
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