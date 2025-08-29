//Q-Write a program which Accept Range of Number From User And Return
//Addition of All Numbers in Between That Range
#include<stdio.h>

int RangeSum(int iStart,int iEnd)
{
    int iSum = 0;
    if(iStart<0 || iEnd<0)
    {  
        return -1;
    }
    else{
    for(int iCnt = iStart;iCnt<=iEnd;iCnt++)
    {
        iSum = iSum + iCnt;
    }
   
    }
    
     return iSum;

    
}
int main()
{ 
    int iValue1 = 0, iValue2 = 0 ,iRet = 0;

    printf("Enter the Starting Number: \n");
    scanf("%d",&iValue1);

    printf("Enter the Ending Number : \n");
    scanf("%d",&iValue2);

    iRet = RangeSum(iValue1,iValue2);
    if(iRet !=-1){

    printf("Addition of number between %d and %d is : %d",iValue1,iValue2,iRet);
    }
    else{
        printf("Invalid Range");
    }
    
    return 0;
}