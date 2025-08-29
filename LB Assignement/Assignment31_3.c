// Write A Program Which Accept String From User and Copy that Characters of String into another string by Converting all Small Character 
// into Capital Case

#include<stdio.h>
#include<string.h>

void Update(char *str,char *dest)
{
    while( *str != '\0')
    {
        if ( *str >= 'a' && *str <= 'z')
        {
            *dest = *str -32;
        }
        else
        {
            *dest = *str;
        }
        str++;
        dest++;

    }
    *dest ='\0';
}
int main()
{   
    char Arr[30];
    char Brr[30];

    printf("Enter the String:");
    scanf("%[^'\n']s",Arr);

    Update(Arr,Brr);

    printf("Updated string are:%s",Brr);
    return 0;
}