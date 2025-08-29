#include<stdio.h>


int OddFactorial(int iNo)
{
    int iCnt = 0;
    int fact = 1;
    for(iCnt=iNo;iCnt>1;iCnt--)
    {    if(iCnt%2!=0){
         fact = fact*iCnt;
    }
    }
    return fact;

}
int main()
{ 
    int iValue = 0,iRet = 0;
    printf("Enter the number:");
    scanf("%d ",&iValue);

    iRet = OddFactorial(iValue);
    printf("Odd Factorial of Number is:%d",iRet);

    return 0;
}