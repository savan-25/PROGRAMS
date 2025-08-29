#include<stdio.h>

void Display()
{
    int iCnt = 0;
    int i = 5;
    while(iCnt<=5)
    {
        printf("%d",iCnt);
        iCnt++;
    }
}

int main()
{
    Display();

    return 0;
}