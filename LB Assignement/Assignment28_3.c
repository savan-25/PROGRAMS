//Accept the String From user and toggle the Case

//input Marvellous Multi OS
//output mARVELLOUS mULTI os

#include<stdio.h>

void Strtoggle(char *str)
{
   while(*str!='\0')
   {
    if(*str>='a' && *str<='z')
    {
        *str = *str-'a'+'A';
    }
    else if(*str>='A' && *str<='Z')
    {
        *str = *str -'A'+'a';
    }
    str++;
   }
}

int main()
{
    char arr[20];

    printf("Enter the String:");
    scanf("%[^'\n']s",arr);

    Strtoggle(arr);

    printf("Toggeled String are:%s",arr);
}