//Q write a program which Accept the Number from user and printf all odd number till that Number
#include<stdio.h>

void Display(int iNo)
{
    for(int iCnt=1;iCnt<=iNo;iCnt++)
    {  
        if(iCnt%2!=0)
        {
       printf("%d\t",iCnt);
        }
    }
}
int main()
{   
    int iValue = 0;
    printf("Enter the Value:");
    scanf("%d",&iValue);
    Display(iValue);
}