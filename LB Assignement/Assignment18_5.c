#include<stdio.h>

int Fact(int iNo)
{  
    int Factorial =1;
    int OddFactorial = 1;
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
    else 
    {
        OddFactorial = OddFactorial * iCnt;
    }
   }

   return Factorial - OddFactorial;
}
int main()
{
    int iValue = 0;
    printf("Enter the Number:");
    scanf("%d",&iValue);

    int iRet = Fact(iValue);
    printf("Differnce Between Even and Factorial :%d",iRet);
}