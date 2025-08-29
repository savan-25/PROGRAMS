//Q Accept the N  Number from User and return the Differnce betn Largest Number And Smallest Number From Array
#include<stdio.h>
#include<stdlib.h>

int Differnce(int Arr[],int iSize)
{
    int iLarge = Arr[0];
    int iSmall = Arr[0];

    int iCnt = 0;
    for(iCnt=0;iCnt<iSize;iCnt++)
    {
        if(iLarge<Arr[iCnt])
        {
            iLarge = Arr[iCnt];
        }
       if(Arr[iCnt]<iSmall)
        {
            iSmall = Arr[iCnt];
        }
        
    }
   int Ans = iLarge -iSmall;
    return Ans;
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

    iRet = Differnce(p,iLength);

    printf("Differnce between Smallest And largest Number is:%d",iRet);
    return 0;
}