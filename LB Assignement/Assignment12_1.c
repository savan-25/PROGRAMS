//Q- Write A Program Which Accept Number From User Return the Count of Even Number
#include<stdio.h>

int CountEven(int iNo)
{   
    int Count = 0;
    int iDigit = 0;
    if(iNo<0)
    {
        iNo = -iNo;
    }
    while(iNo>0)
    {
        iDigit = iNo % 10;
        if(iDigit % 2 == 0)
        {
            Count++;
        }
        iNo = iNo /10;
    }
    return Count;

}
int main()
{  
    int iValue = 0;
    int iRet = 0;

    printf("Enter the Number:");
    scanf("%d ",&iValue);

    iRet = CountEven(iValue);
    printf("%d ",iRet);
    return 0;
}
