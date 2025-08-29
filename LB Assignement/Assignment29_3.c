//Write A Program which accept string and char from user.
//and return index of First occcurence of that charcter

#include<stdio.h>
#include<stdbool.h>

int FirstCh(char str[],char ch)
{   
   for(int i =0;str[i]!='\0';i++)
   {    
    if(str[i]==ch)
    {
        return i;
    }

   }
   return -1;
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
    
    iRet = FirstCh(arr,cVal);


        printf("First Occurence of  '%c' is .%d\n", cVal,iRet);
    
return 0;
}

//getchar() ->Cleared Input Buffer :after Reading the string to consume
//the newline charcter left in the buufer