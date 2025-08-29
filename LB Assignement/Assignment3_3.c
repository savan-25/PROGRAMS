#include<stdio.h>

void DisplayEvenFactor(int iNo)
{
    for(int i=1;i<=iNo;i++)
    {
        if(iNo % i == 0 && i%2==0)
        {
            printf("%d ",i);
        }
    }
}

int main()
{
    int iValue=0;
    printf("Enter the number:");
    scanf("%d",&iValue);

    DisplayEvenFactor(iValue);
    
    return 0;
}