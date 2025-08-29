// 4. Accept one number and Check Whether its Divisible by 5 or not

#include<stdio.h>
#include<stdbool.h>

typedef int BOOL;
#define TRUE 1
#define FALSE 0

bool Check (int iNo)
{
    if((iNo % 5)==0)
    {
        return  TRUE;
    }
    else
    {
        return FALSE;
    }
}
int main()
{
    int iValue = 0;
    BOOL bRet = FALSE;
   
    printf("Enter number");
    scanf("%d",&iValue);

    bRet = Check(iValue);

    if(bRet == TRUE)
    {
        printf("DiVisible by  5");
    }
    else{
        printf("Not Divisible by 5");
    }
}