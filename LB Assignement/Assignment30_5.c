//Accept The Input from User and Check it is Capital or not

#include<stdio.h>
#include<stdbool.h>

bool Check(char ch)
{

    switch(ch)
    {
        case 'A' :
        printf("Your Exam at 7 AM");
        break;

        case 'B':
        printf("Your Exam at 8.30 AM");
        break;

        case 'C':
        printf("Your Exam at 9.20 AM");
        break;

        case 'D':
        printf("Your Exam at 10.30 AM");
        break;

    }
}

int main()
{  
    char cValue = '\0';
    printf("Enter the Character :");
    scanf("%c",&cValue);

    bool bRet = Check(cValue);
    
    return 0;
}