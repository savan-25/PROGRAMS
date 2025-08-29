//4.1 Write a program which accept the number from user and 
//display its multiplication of factor

#include<stdio.h>

int MultFact(int iNo)
{
  int iCnt = 0;
  int Multi =1 ;

  for(iCnt=1;iCnt<iNo;iCnt++)
  {
    if(iNo%iCnt==0)
    {  
        Multi=Multi*iCnt;
    }
  }

  return Multi;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter the Number:");
    scanf("%d ",&iValue);

    iRet = MultFact(iValue);

    printf("%d",iRet);

    return 0;
}