// Write a program which Accept String number from user and 
//Count the total Number of Capital Charcter

#include<stdio.h>


int CountCapital(char *str)
{
   
   int iCount = 0;
   while(*str!=0)
   {
    if((*str>='A' && *str<='Z'))
    {
        iCount ++;
    }

    str++;
   }
   return iCount;

}
int main()
{
    char arr[20];
    int iRet = 0;

    printf("Enter the String");
    scanf("%[^'\n']s",arr);

    iRet = CountCapital(arr);

    printf("Count of Capital Letter is: %d ",iRet);
}