// Write a Program To Find even Factorial Number

#include<stdio.h>

int EvenFactorial(int iNo)
{
   int iCnt = 0;
   int iFact = 1;
   for(iCnt=iNo;iCnt>1;iCnt--)
   {  if(iCnt%2==0)
   {
    iFact = iFact*iCnt;
   }
   }
   return iFact;
}
int main()
{   
    int iValue = 0;
    printf("Enter the Number:");
    scanf("%d ",&iValue);

    int Result = 0;
    Result = EvenFactorial(iValue);

    printf("Factorial of Given Number is :%d",Result);

    return 0;
}

