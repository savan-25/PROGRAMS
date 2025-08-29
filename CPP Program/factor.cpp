// Find All Factors of Number
// input : 10
// Output : 1 ,2 ,5

#include<iostream>
using namespace std;

int main()
{   
    int No;
    cout<<"Enter the Number";
    cin>>No;

    for(int i=1;i<=No/2;i++)
    {
        if(No%i == 0)
        {
          cout<<i<<"\t";
        }
    }
    return 0;
}