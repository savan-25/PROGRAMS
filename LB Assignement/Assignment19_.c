//Q write a program which Accept the Number from user and  diplay pattern
#include<stdio.h>

void Display(int iNo)
{  
    for(int iCnt=iNo;iCnt>=1;iCnt--)
    {
        printf("%d\t#\t",iCnt);
    }
   
}
int main()
{   
    int iValue = 0;
    printf("Enter the Value:");
    scanf("%d",&iValue);
    Display(iValue);
}