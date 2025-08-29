//Q- Write A Program Which Accept A Number From User And 
//Display all Number in Range in Reverse order
//Q-Write a program which Accept Range of Number From User And Return
//Addition of All Numbers in Between That Range
#include<stdio.h>

void RangeSum(int iStart,int iEnd)
{
    if(iStart<iEnd){
    for(int iCnt = iEnd;iCnt>=iStart;iCnt--)
    { 
        printf("%d\t ",iCnt);
      
    }
    }
   else {
      printf(" Invalid Range..");
    }

    
}
int main()
{ 
    int iValue1 = 0, iValue2 = 0 ,iRet = 0;

    printf("Enter the Starting Number: \n");
    scanf("%d",&iValue1);

    printf("Enter the Ending Number : \n");
    scanf("%d",&iValue2);

    RangeSum(iValue1,iValue2);

    
    return 0;
}