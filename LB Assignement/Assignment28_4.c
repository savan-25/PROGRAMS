//Accept the String From user and extract the numbers from string
//input  Marvellous998
//Output 998
#include<stdio.h>

void Display(char *src)
{
    while(*src!='\0')
    { 
      if(*src>='0' && *src<='9')
      {
        printf("%c",*src);
      }
      src++;
    }
}

int main()
{
    char arr[20];

    printf("Enter the String:");
    scanf("%[^'\n']s",arr);

    Display(arr);

    
}