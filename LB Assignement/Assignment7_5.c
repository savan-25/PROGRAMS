#include<stdio.h>


int FactorialDiff(int iNo)
{
    int iCnt = 0,Diff = 0;
    int Efact = 1;
    int Ofact = 1;
    for(iCnt=iNo;iCnt>1;iCnt--)
    {    if(iCnt%2==0){
         Efact = Efact*iCnt;
    }
    else{
        Ofact = Ofact*iCnt;
    }
    }
    Diff= Efact - Ofact;
    return Diff;

}
int main()
{ 
    int iValue = 0,iRet = 0;
    printf("Enter the number:");
    scanf("%d ",&iValue);

    iRet = FactorialDiff(iValue);
    printf("Even Factorial of Number is:%d",iRet);

    return 0;
}