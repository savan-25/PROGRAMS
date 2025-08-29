//Q write a program which Accept the Number from user and  diplay pattern
#include<stdio.h>

void Display(int iNo)
{  
    for(int iCnt=1;iCnt<=iNo;iCnt++)
    {
        printf("*\t");
    }
     for(int iCnt=1;iCnt<=iNo;iCnt++)
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