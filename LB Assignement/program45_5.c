// WRITE A PROGRAM WHICH RETURNS ADDITION OF ALL
// Digits of Number

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
int SumDigit(PNODE head)
{   
    int iSum = 0;
    int iDigit = 0;
    while( head != NULL )
    {   
        while( head->data != 0)
        {
            iDigit = head->data % 10;
            iSum = iSum + iDigit;
            head->data = head->data / 10;
        }
        printf("%d\t",iSum);
        iSum = 0;
        head = head->next;
    }
}
int main()
{
    PNODE first = NULL;
    int iRet = 0;

    InsertFirst(&first,640);
    InsertFirst(&first,240);
    InsertFirst(&first,20);
    InsertFirst(&first,230);
    InsertFirst(&first,110);

    SumDigit(first);

}
