//Accept The Input from User and Check it is Capital or not

#include<stdio.h>
#include<stdbool.h>

bool Check(char ch)
{
    if(ch>= 'A' && ch<= 'Z')
    {
        return true;
    }
    return false;
}

int main()
{  
    char cValue = '\0';
    printf("Enter the Character :");
    scanf("%c",&cValue);

    bool bRet = Check(cValue);
    if(bRet == true)
    {
        printf("it is Capital Letter");
    }
    else
    {
        printf("it is Not Capital Letter");
    }
    return 0;
}