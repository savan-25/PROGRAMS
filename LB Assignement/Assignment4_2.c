//4.2 Write a Program whihc accept number from user and Display'
//number in reverse Order


#include<stdio.h>

void FactRev(int iNo)
{
   int iCnt =0 ;
   for(iCnt=iNo;iCnt>1;iCnt--)
   {
    if(iNo%iCnt==0)
    {
        printf("%d ",iCnt);
    }
   }
}
int main(){
    int iValue=0;
    printf("Enter the Input:");
    scanf("%d ",&iValue);

    FactRev(iValue);

    return 0;
}
