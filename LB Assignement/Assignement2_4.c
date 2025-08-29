// 2.4 Accept two number From user and Display First 
//Number in Second Numbre Of Time
#include<stdio.h>
void Display(int iNo1,int iFreqency)
{
    int iCnt = 0;
    for(iCnt = 1;iCnt<=iFreqency;iCnt++)
    {
        printf("%d\n",iNo1);
    }

}

int main()
{
    int iValue1 = 0,iValue2 = 0;
    

    printf("Enter the First Number:");
    scanf("%d",&iValue1);

    printf("Enter the Frequency");
    scanf("%d",&iValue2);

    Display(iValue1,iValue2);
}