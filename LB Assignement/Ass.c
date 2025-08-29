#include<stdio.h>

int main()
{
    int iCnt = 0;
    int iValue = 0;
    printf("Enter the Number:");
    scanf("%d ",&iValue);

    for(iCnt=1;iCnt<=iValue;iCnt++)
    {
        printf("%d ",iCnt);
    }
    return 0;
}