#include<stdio.h>

int IndR(int iNo)
{
    int Rs = 0;
    Rs = iNo *70;

    return Rs;
}
int main()
{
    int iValue = 0;
    printf("Enter the Value in to us doller:");
    scanf("%d",&iValue);

    int iRet = IndR(iValue);
    printf("Value of %d Doller into indian Currency is:%d",iValue,iRet);
}