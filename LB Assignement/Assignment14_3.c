//Q- Accept N number From User and return Frequency of Even number

#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>


bool Check(int Arr[],int iSize,int iNo)
{
    int flag = 0;
    for(int iCnt = 0;iCnt<iSize;iCnt++)
    {
        if(Arr[iCnt]==iNo)
        {
            flag=1;
            break;
        }
    }
    return flag;
}
int main()
{  
    int iLength =0 ,iCnt = 0;
    int *ptr = NULL;
    
    printf("Enter the Number of Element:");
    scanf("%d",&iLength);
    ptr = (int*) malloc (iLength *sizeof(int));
    
    printf("Enter the Element:");
    for(iCnt =0 ;iCnt<iLength;iCnt++)
    {
        scanf("%d",&ptr[iCnt]);
    }
   int Number = 0;
   printf("Enter the Number to Search: ");
   scanf("%d ",&Number);
  //  bool iRet = Check(ptr,iLength,Number);
    
    if(Check(ptr,iLength,Number) ==1)
    {
        printf("%d Are present in Array:",Number);
    }
    else
   {
     printf("%d Are Not Present in Array:",Number);
    }
    
    free(ptr);
     

     return 0;
}