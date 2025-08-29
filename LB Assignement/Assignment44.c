// WRITE A PROGRAM WHICH SEARCH FIRST OCCURENCE OF PARICULAR 
// ELEMENT OF IN SINGLY LINKED LIST

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
int SearchFirstOcc(PNODE head,int no)
{   
    int iCnt =1;
    while (head != NULL)
    {
        if( head->data == no)
        {
             return iCnt;
        }
        
        head = head->next;
        iCnt++;
    }
    printf("Element is not Present in Linked list");
    
  
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
    InsertFirst(&first,1000);
    InsertFirst(&first,90);
    
    iRet = SearchFirstOcc(first,10);
    printf("Element is Present at index  %d",iRet);
    return 0;
}