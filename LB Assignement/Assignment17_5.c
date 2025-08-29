//Q write a program which Accept the Number from user and display its Multiple up to 5
#include<stdio.h>

void Display(int iNo)
{
    for(int i=1;i<=5;i++)
    {
       printf("%d\t",iNo*i);
    }
}
int main()
{   
    int iValue = 0;
    printf("Enter the Value:");
    scanf("%d",&iValue);
    Display(iValue);
}