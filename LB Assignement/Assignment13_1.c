 // Accept N number from user and return differnce between Summation
 //of Even and Summation of Odd element

#include<stdio.h>
#include<stdlib.h>

int Difference(int Arr[],int iSize)
{   
    int iEvenSum = 0;
    int iOddSum = 0;

    for(int iCnt =0;iCnt<iSize;iCnt++)
    {
        if(Arr[iCnt]%2==0)
        {
            iEvenSum = iEvenSum + Arr[iCnt];
        }
        else
        {
            iOddSum = iOddSum + Arr[iCnt];
        }
    }   

    int Result = iEvenSum - iOddSum;
    return Result ;
   
}
int main()
{  
    int iLength = 0,iRet = 0,iCnt=0;
    int *p = NULL;

    printf("Enter the Number of Element:");
    scanf("%d",&iLength);
    p= (int*) malloc(iLength*sizeof(int));

    if(p==NULL)
    {
       printf("Unable to allocate memory");
       return -1;
    }
   
    for(iCnt=0;iCnt<iLength;iCnt++)
    {
        printf("Enter the %d Element: ",iCnt+1);
        scanf("%d",&p[iCnt]);
    }

    iRet = Difference(p,iLength);
    printf("Result is %d",iRet);

    free(p);
      
   
    return 0;
}