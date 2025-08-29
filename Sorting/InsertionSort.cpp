#include<iostream>
using namespace std;

void InsertionSort(int Arr[],int n)
{
    for(int i=0;i<=n-1;i++)
    {
        int j = i;

        while(j>0 && Arr[j-1] > Arr[j])
        {
            int temp = Arr[j-1];
            Arr[j-1] = Arr[j];
            Arr[j] = temp;

            j--;
        }
    }
}
int main()
{  
    int Arr[] = {4,1,5,2,3};
    int n = 5;
    InsertionSort(Arr,5);

    for(int i=0;i<n;i++ )
    {
        cout<<Arr[i]<<"\t";

    }

    
    return 0;
}

/*
Time complexity: O(N2), (where N = size of the array), for the worst, and average cases.
Reason: If we carefully observe, we can notice that the outer loop, say i, is running from 0 to n-1 i.e. n times, and for each i, the inner loop j runs from i to 1 i.e. i times. For, i = 1, the inner loop runs 1 time, for i = 2, the inner loop runs 2 times, and so on. So, the total steps will be approximately the following: 1 + 2 + 3 +......+ (n-2) + (n-1). The summation is approximately the sum of the first n natural numbers i.e. (n*(n+1))/2. The precise time complexity will be O(n2/2 + n/2). Previously, we have learned that we can ignore the lower values as well as the constant coefficients. So, the time complexity is O(n2). Here the value of n is N i.e. the size of the array.

Space Complexity: O(1)

Best Case Time Complexity: 

The best case occurs if the given array is already sorted. And if the given array is already sorted, the outer loop will only run and the inner loop will run for 0 times. So, our overall time complexity in the best case will boil down to O(N), where N = size of the array.

Special thank*/