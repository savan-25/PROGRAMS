//2.1 Accept one number FRom user and print that number of * on Screen
#include<stdio.h>

void Display(int iNo1)
{
    int iCnt = 0;
    //Write Updater
    while(iCnt<iNo1)
    {
        printf("*");
        iCnt++;
    }
}
int main()
{
    int iValue = 1;
    printf("Enter the Number:");
    scanf("%d",&iValue);

    Display(iValue);
}