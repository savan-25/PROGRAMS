//Q Accept N Number From user and accept Range ,Display all elements from Range


#include<stdio.h>
#include<stdlib.h>

void Range(int Arr[],int iSize,int Start,int End)
{  
    for(int iCnt=0;iCnt<iSize;iCnt++)
    {
        if(Arr[iCnt]>Start && Arr[iCnt] < End)
        {
            printf("%d  ",Arr[iCnt]);
        }
    }
   
}
int main()
{  
    int iLength =0,iCnt = 0,Number=0;
    int iRet = 0;
    int *p=NULL;
    
    printf("Enter the Size of an Array:\n");
    scanf("%d",&iLength);

    p = (int*) malloc(iLength*sizeof(int));

    if(p==NULL)
    {
        printf("Unable to allocate memory:");
        return -1;
    }
     printf("Enter the Value:");
    for(iCnt=0;iCnt<iLength;iCnt++)
    {
        scanf("%d",&p[iCnt]);
    }
    int iStart =0;
   
    printf("Enter the Starting Point:\n");
    scanf("%d",&iStart);
    int iEnd =0;
    printf("Enter the Ending Point:\n");
    scanf("%d",&iEnd);

    Range(p,iLength,iStart,iEnd);
    }