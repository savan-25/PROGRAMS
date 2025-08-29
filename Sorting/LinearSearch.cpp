#include<iostream>
using namespace std;


bool LinearSearch(int Arr[],int target)
{  
    bool bRet  = false;
    for(int i=0;i<6;i++)
    {
        if(Arr[i] == target)
        {
            bRet = true;
            break;
        }
    }
    return bRet;
}
int main()
{    
    int Arr[] = {5,3,44,6,88,9};

    int target = 6;

   bool bRet = LinearSearch(Arr,target);

   if(bRet)
   {
    cout<<"Array is Sorted :\n";
   }else
   {
    cout<<"Array is unsorted:\n";
   }
    return 0;
}