#include<stdio.h>
#include<string.h>

void StrCpyRev(char *src,char *dest1)
{
    int i = 0;
    int len = strlen(src);
    
    for(i = 0;i<len;i++)
    {
        dest1[i] = src[len-i-1];
    }
    dest1[len] = '\0';
   
}
int main()
{    
    char Arr[30] = "Marvellous Infosystem";
    char drr[30]; // Empty String

    StrCpyRev(Arr,drr);

    printf("%s",drr);
    return 0;
}