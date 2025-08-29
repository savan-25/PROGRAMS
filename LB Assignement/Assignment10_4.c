//Q-Write A Program Which Accept range From user And Return
//Addition of All Even Number in Between The Range
//Q-Write a program which Accept Range of Number From User And Return
//Addition of All Numbers in Between That Range
#include<stdio.h>

int RangeSum(int iStart,int iEnd)
{   
    int iCnt = 0;
    int iSum = 0;
    
    for( iCnt = iStart;iCnt<=iEnd;iCnt++)
    {  if(iCnt%2==0){
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

    printf("Addition of number between %d and %d is : %d",iValue1,iValue2,iRet);
    
    return 0;
}