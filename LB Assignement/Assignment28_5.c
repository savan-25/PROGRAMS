// write a program Which Counts The Total Number of White Space in string

#include<stdio.h>

int CountWhite(char *str)
{   
    int iCount = 0;
    while(*str!='\0')
    {
        if(*str=='\n'||*str=='\t'||*str == ' ')
        {
            iCount++;
        }
        str++;
    }
    return iCount;
}

int main()
{
    char arr[20];
    int iRet = 0;

    printf("Enter the String:");
    scanf("%[^'\n']s",arr);
    
    iRet = CountWhite(arr);

    printf("Count of White Spaces is:%d",iRet);
    
}