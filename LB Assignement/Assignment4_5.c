//4.5 Write a program accept a number from user and return
//Difference betn summation of all its factors and non faactor

#include<stdio.h>

int FactDiff(int iNo)
{ 
  int iNsum=0;
  int iFsum=0;
  for(int i=0;i<iNo;i++)
  {
    if(iNo%i==0)
    {
        iFsum=iFsum+i;
    }
  }
   

  return iFsum;
}

int main()
{
    int iValue ;
    int iRet ;

    printf("Enter the Number:");
    scanf("%d",&iValue);

    iRet = FactDiff(iValue);

    printf("%d",iRet);

    return 0;
}