#include<stdio.h>

typedef int BOOL;
#define TRUE 1
#define FALSE 0

int  ChkVowel(char ch)
{   char Arr1[6] = {'a','e','i','o','u'};
    for(int i=0;i<=6;i++){

    
        if(ch==Arr1[i]){
                 return TRUE;
         }
             else{
                     return FALSE;
                }
    }
    
}
int main()
{
    char cValue = '\0';
    BOOL bRet = FALSE;

    printf("Enter Character:\n");
    scanf("%c",&cValue);

    bRet = ChkVowel(cValue);

    if(bRet==TRUE)
    {
        printf("It is Vowel");
    }
    else{
        printf("It is Not Vowel");
    }

    return 0;

}