//Accept Amount in uS and returns its Corresponding value
//In indian Currency Consider 1$=70

#include<stdio.h>

int DollerToINR(int iNo)
{
  return iNo*70;
}
int main()
{   
    int iValue = 0;
    int iRet = 0;
    printf("Enter the Number of uSd");
    scanf("%d ",&iValue);

    iRet = DollerToINR(iValue);

    printf("Value in INR is %d ",iRet);
    return 0;
}