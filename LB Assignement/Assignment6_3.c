#include<stdio.h>

int factorial(int iNo)
{   int fact  = 1;
    for(int i =iNo;i>1;i--)
    {  fact = fact*i;
    }

    return fact;
}
int main()
{ 
    int iValue =0 ;
    printf("Enter the number");
    scanf("%d ",&iValue);

    int iRet = factorial(iValue);
    printf("Factorial is" ,iRet);
    return 0;

}