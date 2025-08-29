//Q Accept the N  Number from User and return Such Number Which Contains 3 Digits in it
#include<stdio.h>
#include<stdlib.h>

void Digits(int Arr[],int iSize)
{
   int iCnt = 0;
    printf("The  Number Which Constain Three Digit in it:");
   for(iCnt = 0;iCnt<iSize;iCnt++)
   {
    if(Arr[iCnt]>=100 && Arr[iCnt]<=999)
    {  
    
        printf("%d  ",Arr[iCnt]);
    }
   }
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

    Digits(p,iLength);
    return 0;
}

/* This program Can Be solved Using Another method By The 
    Help of  % and / Operator with in two While Loop*/