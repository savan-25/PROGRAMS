//Write A Program which accept string and char from user.
//return the frequency of that character

#include<stdio.h>
#include<stdbool.h>

int CFrequency(char *str,char ch)
{   
    int cCount = 0;
    while(*str!='\0')
    {  
      if(*str == ch)
      {
        cCount++;
      }
      str++;
    }
    return cCount;
   
}

int main()
{
    char arr[100];
    char cVal ;
    int iRet = 0;

    printf("Enter the String:");
    scanf("%[^'\n']s",arr);

    getchar();
    printf("Enter the Char  for serach:");
    scanf("%c",&cVal);
    
    iRet = CFrequency(arr,cVal);


        printf("Frequency of  '%c' is .%d\n", cVal,iRet);
    
return 0;
}

//getchar() ->Cleared Input Buffer :after Reading the string to consume
//the newline charcter left in the buufer