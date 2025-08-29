//Q- Write A Program Which Accept Number From User Return the Count of Even Number
#include<stdio.h>

int MulDigit(int iNo)
{   
    int iMul = 1;
    int iDigit = 0;
    if(iNo<0)
    {
        iNo = -iNo;
    }
    while(iNo>0)
    {
        iDigit = iNo % 10;
        iMul = iMul * iDigit;
        iNo = iNo /10;
    }
    return iMul;

}
int main()
{  
    int iValue = 0;
    int iRet = 0;

    printf("Enter the Number:");
    scanf("%d ",&iValue);

    iRet = MulDigit(iValue);
    printf("%d ",iRet);
    return 0;
}
