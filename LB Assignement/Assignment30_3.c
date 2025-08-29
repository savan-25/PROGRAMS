//Accept The Input from User and Check it is digit or not

#include<stdio.h>
#include<stdbool.h>

bool Check(char ch)
{
    if(ch>= '0' && ch<= '9')
    {
        return true;
    }
    return false;
}

int main()
{  
    char cValue = '\0';
    printf("Enter the Number :");
    scanf("%c",&cValue);

    bool bRet = Check(cValue);
    if(bRet == true)
    {
        printf("it is Number");
    }
    else
    {
        printf("it is Not Number");
    }
    return 0;
}