//Q- Write A program which Accept number From User And Count
// Frequecy of 2 in it

#include<stdio.h>

int CountTwo(int iNo)
{  
    int Count = 0;
    int iDigit = 0;
   if(iNo < 0)
   { 
    iNo = -iNo;
   }
   while(iNo > 0)
   {  
    iDigit = iNo % 10;
      if(iDigit==2)
      {
        Count ++;
    
      }
    iNo = iNo / 10;
    
   }
   return Count;
}
int main()
{  
    int iValue = 0;
    printf("Enter The Number :\n");
    scanf("%d ",&iValue);

    int iRet = CountTwo(iValue);
    printf("Count oF 2 is :%d",iRet);
    return 0;
}