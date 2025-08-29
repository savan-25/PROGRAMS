// Accept char from user and display ites Ascii valu in decimal and octal,hexadecimal


#include<stdio.h>
void Display( char ch)
{     
    if(ch>='a' && ch <='z' || ch>='A' && ch<='Z')
    {
          printf("%d\t %o\t %x\t",ch);
    }

}  


int main()
{   
   char input = '\0';
    printf("Enter the Character:");
    scanf("%c",&input);

    Display(input);
    return 0;
}
