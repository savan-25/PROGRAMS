//Write A Program which accept string and reverse it

#include<stdio.h>
#include<stdbool.h>

void Reverse(char *str)
{   

   char *Start = str;
   char *End  = str;
   char temp = '\0';

   while(*End!='\0')
   {
    End++;
   }
   End--;
   while(*Start<*End)
   {
        temp = *Start;
        *Start = *End;
        *End = temp;
        Start++;
        End--;
   }



}

int main()
{
    char arr[20];
  
    int iRet = 0;

    printf("Enter the String:");
    scanf("%[^'\n']s",arr);

  
    Reverse(arr);
    printf("Reveres string is:%s",arr);
    
return 0;
}

//getchar() ->Cleared Input Buffer :after Reading the string to consume
//the newline charcter left in the buufer