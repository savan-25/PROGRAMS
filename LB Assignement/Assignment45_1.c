// Program for display all number which are Perfect from Singly linear Linked list

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
int Perfect(PNODE head)
{   
    int  iSum = 0;
    int temp = 0;
    while (head != NULL )
    {     
        temp = head->data;

         for (int i = 1;i <= (temp/2);i++)
         {
            if( temp % i == 0)
            {
                iSum = iSum + i;
            }
         }

         if( iSum == temp)
         {
            printf("%d\t",temp);
         }
         iSum = 0;
        head = head->next;
    }

}
int main()
{   
    PNODE first = NULL;
    int iRet = 0;
    InsertFirst(&first,41);
    InsertFirst(&first,17);
    InsertFirst(&first,28);
    InsertFirst(&first,11);
    InsertFirst(&first,16);
    InsertFirst(&first,6);
    
    Perfect(first);
  
    return 0;
}