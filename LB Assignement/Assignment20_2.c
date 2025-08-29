//Q write a program which Accept the Number from user and  diplay pattern
#include<stdio.h>

void Display(int iNo,int iNo2)
{
      for(int i =1;i<=iNo;i++)
      {
        for(int j=iNo2;j>=1;j--)
        {
           printf("%d\t",j);
        }
        printf("\n");
      }
}

int main()
{   
    int iValue1 = 0;
    int iValue2 = 0;
    printf("Enter the Row Value:");
    scanf("%d",&iValue1);
    printf("Enter the Column Value:");
    scanf("%d",&iValue2);
    Display(iValue1,iValue2);
}