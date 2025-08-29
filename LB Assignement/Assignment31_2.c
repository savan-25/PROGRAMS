#include<stdio.h>
#include<string.h>

void StrCpyX( char *str,char *dest)
{
      int len = strlen(str);
       int j = 0;
      for(int i = 0;i<len;i++){
        if(str[i] !=' ')
        {
            dest[j] = str[i];
            j++;
        }
      }
     dest[j] = '\0';
}
int main()
{    
    char Arr[30];
    char Brr[30];
    char Crr[30];
    printf("Enter the String:");

    scanf("%[^'\n']s",Arr);
   
    StrCpyX(Arr,Brr);

    printf("Strinf After Removing White Spaces:%s\n",Brr);

   
}
