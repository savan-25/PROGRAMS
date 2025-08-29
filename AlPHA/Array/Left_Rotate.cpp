#include<iostream>
using namespace std;

class Left_Rotate
{
    public:

    void Convert(int Arr[],int n,int d)
    {
       d = d % n;
       int temp[d]; 
       for(int i =0;i<d;i++)
       {
        temp[i] = Arr[i];
       }
       for(int i=d;i<n;i++)
       {
        Arr[i-d] = Arr[i];
       }
       for(int i = d;i<n;i++)
       {
        Arr[i] = temp[i - (n-d)]; 
       }
    }

};
int main()
{   
     Left_Rotate lobj;
     
     int Arr[] = {1,2,3,4,5};
    
     lobj.Convert(Arr,5,3);

    return 0;
}