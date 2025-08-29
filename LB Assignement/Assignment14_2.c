//Q-Accept N number from user And return differnece between frequency of even number 
//and number
#include<stdio.h>
#include<stdlib.h>


int DiffEvenOddCount(int Arr[],int iSize)
{
    int iFrequencyEven = 0;
    int iFrequncyOdd = 0;
    for(int iCnt = 0;iCnt<iSize;iCnt++)
    {
        if((Arr[iCnt]%2)==0)
        {
            iFrequencyEven++;
        }
        else{
            iFrequncyOdd++;
        }
    }
    return iFrequencyEven-iFrequncyOdd;
}
int main()
{  
    int iLength =0 ,iCnt = 0;
    int *ptr = NULL;
    
    printf("Enter the Number of Element:");
    scanf("%d",&iLength);
    ptr = (int*) malloc (iLength *sizeof(int));
    
    printf("Enter the Element:");
    for(iCnt =0 ;iCnt<iLength;iCnt++)
    {
        scanf("%d",&ptr[iCnt]);
    }

    int iRet = DiffEvenOddCount(ptr,iLength);

    printf("Frequency of Even Number is:%d",iRet);

    free(ptr);
    return 0;
}
