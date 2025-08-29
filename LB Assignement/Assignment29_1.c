//Write A Program which accept string and char from user and chek char present in string or not

#include<stdio.h>
#include<stdbool.h>

bool ChkChar(char *str,char ch)
{   
    
    while(*str!='\0')
    {
      if(*str == ch)
      {
        return true;
      }
      str++;
    }
    return false;
   
}

int main()
{
    char arr[100];
    char cVal ;
    bool bRet = false;

    printf("Enter the String:");
    scanf("%[^'\n']s",arr);

    getchar();
    printf("Enter the Char  for serach:");
    scanf("%c",&cVal);
    
    bRet = ChkChar(arr,cVal);

    if (bRet == true)
    {
        printf("Character '%c' is present in the string.\n", cVal);
    }
    else
    {
        printf("Character '%c' is not present in the string.\n", cVal);
    }
return 0;
}

//getchar() ->Cleared Input Buffer :after Reading the string to consume
//the newline charcter left in the buufer