//Q Accept the N  Number from User and return the Largest Number From Array
#include<stdio.h>
#include<stdlib.h>

int Maximum(int Arr[],int iSize)
{
    int iLarge = Arr[0];

    int iCnt = 0;
    for(iCnt=0;iCnt<iSize;iCnt++)
    {
        if(iLarge<Arr[iCnt])
        {
            iLarge = Arr[iCnt];
        }
    }

    return iLarge;
}

int main()
{  
    int iLength = 0, iCnt = 0 , iRet = 0;
    int *p = NULL;

    printf("Enter the Number of Elements You Want to Add: ");
    scanf("%d",&iLength);
    
    p = (int *) malloc (iLength * sizeof(int*));

    if(p==NULL)
    {
        printf("Unable to Allocate the Memory:");
        return -1;
    }

    printf("Enter the Number :");
    for(iCnt = 0;iCnt<iLength;iCnt++)
    {
        scanf("%d",&p[iCnt]);
    }

    iRet = Maximum(p,iLength);

    printf("Largest Number From Array is:%d",iRet);
    return 0;
}