// Selection Sort ALgorithm

#include<iostream>
using namespace std;


void SelectionSort(int Arr[],int iSize)
{

    int i = 0,j = 0,temp,min;
     
    for(i=0;i<iSize-1;i++)
    {
        min = i;
        for(j=i+1;j<iSize;j++)
        {
            if(Arr[j] < Arr[min])
            {
                min = j;
            }
        }
        if(min !=i)
        {
        temp = Arr[i];
        Arr[i] = Arr[min];
        Arr[min] = temp;
        }
    }

    cout<<"Sorted Array in Ascending Order : ";
    for(i=0;i<iSize;i++)
    {
        cout<<Arr[i]<<"\t";
    }

}
int main()
{
    int iSize = 0;
    int Arr[iSize];

    cout<<"Enter the Size of Array :\n";
    cin>>iSize;

    cout<<"Enter the Element of an Array \n";
    for(int i=0;i<iSize;i++)
    {
        cin>>Arr[i];
    }

    SelectionSort(Arr,iSize);
}