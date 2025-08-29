//Q- Accept N number From User and return Frequency of Even number

#include<stdio.h>
#include<stdlib.h>


int EvenCount(int Arr[],int iSize)
{
    int iFrequency = 0;
    for(int iCnt = 0;iCnt<iSize;iCnt++)
    {
        if((Arr[iCnt]%2)==0)
        {
            iFrequency++;
        }
    }
    return iFrequency;
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

    int iRet = EvenCount(ptr,iLength);

    printf("Frequency of Even Number is:%d",iRet);

    free(ptr);
    return 0;
}