//Accept String From user and Convet it into UpperCase
#include<stdio.h>
void struprx(char *str)
{   
   while(*str!='\0')
   {
    if(*str>='a' && *str<='z')
    {
        *str= *str -'a'+'A';
    }
    str++;
   }
}

int main()
{
    char arr[20];

    printf("Enter the String");
    scanf("%[^'\n']s",arr);

    struprx(arr);

    printf("Modified String is:%s",arr);

    return 0;

}