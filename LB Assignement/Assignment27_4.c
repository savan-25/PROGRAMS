// Write a program which Accept String number from user and 
//Check vowels in it or not

#include<stdio.h>
#include<stdbool.h>


bool Check(char *str)
{
     char ch [] = "aeiouAEIOU";
   int i = 0;
   while(*str!=0)
   {
    
    for (int i = 0; ch[i] != '\0'; i++) {
            if (*str == ch[i]) {
                return true;  // If vowel is found, return true
            }
    }
    str++;
   }
   return false;

}
int main()
{
    char arr[20];
    int iRet = 0;

    printf("Enter the String");
    scanf("%[^'\n']s",arr);
  
  bool Ret = Check(arr);
  if(Ret ==true)
  {
    printf("it Contains Vowels ");
  }
  else
  {
    printf("it Not Contain Vowels");
  }
    
}