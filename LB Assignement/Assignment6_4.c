#include<stdio.h>

// Write a program Which Accept Number From user And Display its Table

void Table(int iNo)
{
    int iCnt = 0;
    for(iCnt=1;iCnt<=10;iCnt++)
    {
        printf("%d ",iNo*iCnt);
    }
}
int main()
{  
    int iValue = 0;

    printf("Enter the Input:");
    scanf("%d ",&iValue);

    Table(iValue);
    return 0;
}