//4.3 Accept number From user and Display all its Non factor



#include<stdio.h>

void NonFact(int iNo)
{
   int iCnt =0 ;
   for(iCnt=1;iCnt<iNo;iCnt++)
   {
    if(iNo%iCnt!=0)
    {
        printf("%d ",iCnt);
    }
   }
}
int main(){
    int iValue=0;
    printf("Enter the Input:");
    scanf("%d ",&iValue);

    NonFact(iValue);

    return 0;
}
