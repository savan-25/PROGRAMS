//4.1 Accept the number from User And print The Summation 
//of all its Non Factor

#include<stdio.h>

int SumNonFact(int iNo)
{
    int iSummation = 0;

    int iCnt=0;
    for(iCnt=1;iCnt<iNo;iCnt++)
    {
       if(iNo%iCnt!=0)
       {
        iSummation=iSummation+iCnt;
      
       }
    }

    return iSummation;
}
int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter The Number:");
    scanf("%d",&iValue);

    iRet=SumNonFact(iValue);

    printf("Summation of all Non Factorial is:%d",iRet);

    return 0;
}