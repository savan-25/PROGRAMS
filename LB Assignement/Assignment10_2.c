//Q- Write a progrom Which Accept range form user An Dispaly
// all even number in Between that range
#include<stdio.h>

void RangeDisplay(int iStart,int iEnd)
{   
    int iCnt = 0;
     for(iCnt=iStart ; iCnt<=iEnd;iCnt++)
     {   
        if(iCnt%2==0){
        printf("%d\t",iCnt);
        }
     }
}
int main()
{  
    int iValue1 = 0,iValue2 = 0;

    printf("Enter the Starting Point:\n");
    scanf("%d",&iValue1);

    printf("Enter The Ending Point :\n");
    scanf("%d",&iValue2);

    RangeDisplay(iValue1,iValue2);
    return 0;
}