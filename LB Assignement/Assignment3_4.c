#include <stdio.h>  
#include <conio.h>  

void DisplayConvert(char cValue)
{        int ascii;  
         char upr, lwr;
    if(cValue>='A' && cValue<='Z')
    {  
         ascii = upr + 32;  
      printf (" %c character in Lower case is: %c", upr, ascii);  
      
    }
    else if(cValue>='a' && cValue<='z')
    {
     ascii = lwr - 32;  
    printf (" %c character in the Upper case is: %c", lwr, ascii);     
    }
}
int main ()  
{  
    char upr, lwr; // declare variables  
    int ascii;  
      
    // convert in lower case  
    printf (" Enter the Character: ");  
    scanf (" %c", &upr);  

    DisplayConvert(upr);
   
  
}