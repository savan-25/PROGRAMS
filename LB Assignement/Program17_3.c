//Q write a program which Accept the Number from user and display its Number  Line
#include<stdio.h>

void Display(int iNo)
{
    for(int i=-iNo;i<=iNo;i++)
    {
       printf("%d\t",i);
    }
}
int main()
{   
    int iValue = 0;
    printf("Enter the Value:");
    scanf("%d",&iValue);
    Display(iValue);
}