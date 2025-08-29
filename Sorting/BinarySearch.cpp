#include<iostream>
using namespace std;

bool BinarySearch(int Arr[],int target,int n)
{  
    bool bRet = false;
    int low = 0;
     int high = n-1;

    // mid = (low+high)/2;

    while(low <= high)
    {  
        int mid = (low+high)/2;
        if(Arr[mid] == target)
        {
            bRet = true;
            break;
        }
        else if(Arr[mid] < target)
        {
           low = mid+1; 
        }
        else
        {
            high = mid-1;
        }
    }
    return bRet;
   
}
int main()
{   
    bool bRet = false;
    int Arr[] = {1,2,4,5,6};
    int target = 45;

    bRet = BinarySearch(Arr,target,5);


    if(bRet)
    {
        cout<<"Element is Present in the Array:\n";
    }
    else
    {
        cout<<"Element is Not present:";
    }
    return 0;
}