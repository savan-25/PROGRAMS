// Accept char from user and print charcter from that char to z


#include<stdio.h>
void Display( char ch)
{   

    if(ch >= 'a' && ch<='z') 
    {
        while(ch<='z')
        {
            printf("%c\t",ch);
            ch++;
        }
    }  
      if(ch >= 'A' && ch<='Z') 
    {
        while(ch<='Z')
        {
            printf("%c\t",ch);
            ch++;
        }
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
