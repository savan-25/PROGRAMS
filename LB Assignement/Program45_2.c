// Program for display all number which Display prime from Singly linear Linked list

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
int DisplayPrime(PNODE head)
{   
    int  iSum = 0;
    int temp = 0;
    while (head != NULL )
    {     
        temp = head->data;
       
         for (int i = 2;i < (temp/2);i++)
         {
            if( temp % i == 0 || temp <= 1)
            {   
               return 0; 
            }
        
         }
        printf("%d",temp);
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
    InsertFirst(&first,23);
    InsertFirst(&first,21);
    InsertFirst(&first,1);
    
    DisplayPrime(first);
  
    return 0;
}