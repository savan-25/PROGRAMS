//Q-Accept N number from User and accept one Another variable No and return the 
//Frequency of No

#include<stdio.h>
#include<stdlib.h>


int Frequency(int Arr[],int iSize,int No1)
{  int Count = 0;
   int iCnt = 0;
    for(iCnt=0;iCnt<iSize;iCnt++)
    {
        if(Arr[iCnt]==No1)
        {
            Count++;
        }
    }
    return Count;
    
}
int main()
{   
    int iLength = 0, iRet = 0,  iCnt =0 ;
    int No = 0;
    int *p = NULL;

    printf("Enter the Number you Want to Add:");
    scanf("%d",&iLength);

    p = (int*) malloc (iLength *sizeof(int)); //Dynamic memory Allocation
    printf("Enter the Number:");
    for(iCnt=0;iCnt<iLength;iCnt++)
    {
        scanf("%d",&p[iCnt]);
    }
      
      printf("Enter the Number that Frequency you Want to Count:");
      scanf("%d",&No);
      iRet = Frequency(p,iLength,No);
    
    printf("frequecy of %d is :%d",No,iRet);
    free(p);
    
    return 0;
}