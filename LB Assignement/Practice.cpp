
// program For Displaying Linked List in Reverse manner
#include<iostream>
using namespace std;

typedef struct node
{
    int data ;
    struct node*next;
}NODE,*PNODE;

class Singlly
{
    public:
    PNODE head;
    int iCount;
    
    Singlly()
    {
        head = NULL;
        iCount = 0;
    }
    void InsertLast(int iNo);
    void RevereseDisplay();
};
void Singlly :: InsertLast(int iNo)
{
    PNODE newn = NULL;
    
    newn = new NODE;
    newn->data = iNo;
    newn->next = NULL;
    
    if( head == NULL)
    {
        head = newn;
    }
    else
    {
        PNODE temp = head;
        while ( temp->next != NULL) 
        {
            temp= temp->next;
        }
        temp->next = newn;
    }
    iCount++;
    
}
void Singlly :: RevereseDisplay()
{
    PNODE temp = head;
    
    while( temp != NULL )
    {
        cout<<temp->data<<"\n";
        temp=temp->next;
    }
}
int main(){
    
    Singlly sObj;
    
   int TestCase = 0;
   int n = 0;
   int data = 0;
   
   for( int i = 0 ;i<TestCase;i++)
   {
    for(int i = 0;i<n;i++)
    {
        cin>>data;
        sObj.InsertLast(data);
    }
   }
   sObj.RevereseDisplay();

}
