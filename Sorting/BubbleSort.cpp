
/*
Problem Statement: Given an array of N integers, write a program to implement the Bubble Sorting algorithm.

Examples:

Example 1:
Input: N = 6, array[] = {13,46,24,52,20,9}
Output: 9,13,20,24,46,52
Explanation: After sorting we get 9,13,20,24,46,52


Input: N = 5, array[] = {5,4,3,2,1}
Output: 1,2,3,4,5
Explanation: After sorting we get 1,2,3,4,5
*/
#include<iostream>
using namespace std;

void BubbleSort(int Arr[],int iSize)
{ 
  int temp = 0;
  for(int i=iSize-1;i>=0;i--)
  {

    for(int j=0;j<i-1;j++)
    {
      if(Arr[j] > Arr[j+1])
      {
       temp = Arr[j];
       Arr[j] = Arr[j+1];
       Arr[j+1] = temp;
      }
    }
  }

}
int main()
{  
    int iSize = 0 ,i=0;

    cout<<"Enter the Size of an Array :\n";
    cin>>iSize;

    int  Arr[iSize];

    cout<<"Enter the Elements : ";
    for(i =0;i<iSize;i++)
    {
        cin>>Arr[i];
    }

    BubbleSort(Arr,iSize);

    for(i=0;i<iSize;i++)
    {
       cout<<Arr[i]<<"\t";
    }


}