#include <iostream>
using namespace std;

bool Target(int arr[],int iSize)
{  
    int target =0 ;
    cout<<"Enter the targeted Value:\n";
    cin>>target;
    for(int i =0;i<iSize;i++)
    {
        for(int j=i+1;j<iSize;j++)
        {
            if(arr[i]+arr[j]==target)
            {
                return true;
            }
        }
        
    }
    return false;

}
int main(){
  
    int iLength = 0;
    bool Result = false;

    cout<<"Enter the Length of Array:\n";
    cin>>iLength;
    
    int * Arr = new int [iLength];
    cout<<"Enter the Element into the Array:\n";
    for(int iCnt=0;iCnt<iLength;iCnt++)
    {
        cin>>Arr[iCnt];
    }
    cout<<"Element of an Array is:";
    for(int i =0;i<iLength;i++)
    {
        cout<<" "<<Arr[i];
    }
    Result= Target(Arr,iLength);
    if(Result == true)
    {
        cout<<"Pair is Found \n";
    }
    else{
        cout<<"pair is Not found\n";
    }
     
    return 0;
}