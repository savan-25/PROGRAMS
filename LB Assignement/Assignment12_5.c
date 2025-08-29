//Q- Write A Program Which Accept Number From User Return the Count of Even Number
#include<stdio.h>

int CountDiff(int iNo)
{   
    int EvenSum = 0;
    int OddSum = 0;
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
            EvenSum = EvenSum +iDigit;
        }
        else{
            OddSum = OddSum + iDigit;
        }
        iNo = iNo /10;
    }
    return (EvenSum - OddSum);

}
int main()
{  
    int iValue = 0;
    int iRet = 0;

    printf("Enter the Number:");
    scanf("%d ",&iValue);

    iRet = CountDiff(iValue);
    printf("%d ",iRet);
    return 0;
}
