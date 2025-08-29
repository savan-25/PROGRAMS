// Write a program which Accept String number from user and Convert into Small Letter

#include<stdio.h>


void ToLower(char *str)
{
   while(*str!='\0')
   {
    if(*str>='A' && *str<='Z')
    {
        *str = *str -'A'+'a';
    }
    str++;
   }
  
}
int main()
{
    char arr[20];
    int iRet = 0;

    printf("Enter the String");
    scanf("%[^'\n']s",arr);

     ToLower(arr);

     
  printf("Modified String is: %s",arr);
    
}