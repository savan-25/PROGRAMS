//Q write a program which Accept the Number from user and print number of $ * & on Screen
#include<stdio.h>

void Display(int iNo)
{
    for(int i=1;i<=iNo;i++)
    {
        printf("$\t");
    }
}
int main()
{   
    int iValue = 0;
    printf("Enter the Value:");
    scanf("%d",&iValue);
    Display(iValue);
}