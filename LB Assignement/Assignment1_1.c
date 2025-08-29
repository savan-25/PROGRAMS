#include<stdio.h>

int Divide(int iNo1,int iNo2)
{
    int iAns = 0;
    if(iAns == 0)
    {
        return -1;
    }
    iAns =iNo1/iNo2;

    return iAns;
}
int main()
{   
    int iValue1 = 15,iValue2 = 5,iRet;
    iRet = Divide(iValue1,iValue2);

    printf("Division is:%d",iRet);
    return 0;
}
