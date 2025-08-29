#include<stdio.h>

int Fact(int iNo)
{  
    int Factorial =1;
    if(iNo<0)
    {
        iNo=-iNo;
    }
   for(int iCnt =iNo;iCnt>=1;iCnt--)
   {
    if(iCnt%2==0)
    {
        Factorial = Factorial*iCnt;
    }
   }

   return Factorial;
}
int main()
{
    int iValue = 0;
    printf("Enter the Number:");
    scanf("%d",&iValue);

    int iRet = Fact(iValue);
    printf("Even Factoria of %d is :%d",iValue,iRet);
}