// Accept char from user.if char is small then display corrresponding Capital
// if Small Then print Corresponding Capital


#include<stdio.h>
void Display( char ch)
{     

  if(ch>='a' && ch<='z')
  {
    ch=ch-'a'+'A';
    printf("%c",ch);
  }
  else if(ch>='A' && ch<='Z')
  {
    ch=ch-'A'+'a';
    printf("%c",ch);
  }
  else{
    printf("ch");
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
