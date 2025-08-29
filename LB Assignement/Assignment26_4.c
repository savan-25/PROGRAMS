//Accept the char from user and check whether it is special symbol or not
#include<stdio.h>
#include<stdbool.h>
bool ChkSpecial(char ch)
{ 
    if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' || ch>='0' && ch<='9')
    {
        return false;
    }
    return true;

}

int main()
{
    char cValue = '\0';

    bool bRet = false;

    printf("Enter the Character:");
    scanf("%c",&cValue);

    bRet = ChkSpecial(cValue);

    if(bRet == true)
    {
        printf("it is Special Character:");
    }
    else
    {
        printf("it is not Special Charcter:");
    }

    return 0;
}