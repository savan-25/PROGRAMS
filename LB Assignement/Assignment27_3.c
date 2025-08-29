// Write a program which Accept String number from user and 
//return Differnce of Small char and Frequecy of Capital letter

#include<stdio.h>


int Differnce(char *str)
{
   
   int iCount = 0;
   int iCount1 = 0;

   while(*str!=0)
   {
    if((*str>='A' && *str<='Z'))
    {
        iCount ++;
    }
    if((*str>='a' && *str<='b'))
    {
        iCount1 ++;
    }
    

    str++;
   }
   return iCount-iCount1;

}
int main()
{
    char arr[20];
    int iRet = 0;

    printf("Enter the String");
    scanf("%[^'\n']s",arr);

    iRet = Differnce(arr);

    printf("Count of Capital Letter is: %d ",iRet);
}