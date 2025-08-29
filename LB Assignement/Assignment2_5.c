// 2.5 Accept Number From User and Check Number is Eeven or odd

#include<Stdio.h>

#include<stdbool.h>
#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChekEven(int iNo)
{
    if(iNo%2==0)
    {
        return TRUE;
    }
    else{
        return FALSE;
    }
}
int main()
{
    int iValue = 0;
    BOOL bRet = FALSE;
    printf("Enter the Number:");
    scanf("%d\n",&iValue);

    bRet = ChekEven(iValue);

    if(bRet==1)
    {
        printf("Number is 0dd");
    }
    else{
        printf("Number is False");
    }
}