#include<stdio.h>

void Pattern(int iNo)
{
    for(int i =0 ;i<iNo;i++)
    {
        printf(" $ "" * ");
    }
}
int main()
{  
   int iValue = 0;
   printf("Enter the number:");
   scanf("%d",&iValue);

   Pattern(iValue);
    return 0;
}