//Q-Accept N number from User And Return Frequency of 11
#include<stdio.h>
#include<stdlib.h>


int Frequecy(int Arr[],int iSize)
{
    int iFrequency=0;
    for(int iCnt = 0;iCnt<iSize;iCnt++)
    {
        if(Arr[iCnt]==11)
        {
            iFrequency ++;
            //continue;
       }
    }
    return iFrequency;

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

    int iRet = Frequecy(ptr,iLength);

    printf("Frequency of  11 is:%d",iRet);

    free(ptr);
    return 0;
}
