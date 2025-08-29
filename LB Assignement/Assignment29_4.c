//Write A Program which accept string and char from user.
//and return index of First occcurence of that charcter

#include<stdio.h>

int RetIndex(char str[],char ch)
{
  int iCnt = 0;
  int iIndex = 0;
  
  for(iCnt = 0;str[iCnt]!='\0';iCnt++)
  {
    if(str[iCnt]==ch)
    {
         iIndex = iCnt;
    }
    else{
        iIndex = -1;
    }
  }
  return iIndex;
}

int main()
{   
    char arr[20];
    char ip = '\0';

    printf("Enter the String:\n");
    scanf("%[^'\n']s",arr);

    getchar();

    printf("Enter the Character:\n");
    scanf("%c",&ip);

    int Result = RetIndex(arr,ip);

    printf("Last Occurence of Character is:%d",Result);
    return 0;

}

//getchar() ->Cleared Input Buffer :after Reading the string to consume
//the newline charcter left in the buufer