//Q Accept N Number From user and Display all Such Elements
//which are divisible by 5 and 3
#include<stdio.h>
#include<stdlib.h>

void Display(int Arr[],int iSize)
{
    int iCnt = 0;
    for(iCnt=0;iCnt<iSize;iCnt++)
    {
        if((Arr[iCnt]%5)==0 && (Arr[iCnt]%3)==0 )
        {
            printf("%d ",Arr[iCnt]);
        }
    }
}
int main()
{  
    int iLength = 0;

    int *p = NULL;

    printf("Enter Number of Elements:");
    scanf("%d",&iLength);
    
    p = (int*)malloc(iLength * sizeof(int));

    if(p==NULL)
    {
        printf("Unable to allocate the Memory:");
        return -1;
    }
    printf("Enter the Element:");
    for(int iCnt=0;iCnt<iLength;iCnt++)
    {
        scanf("%d",&p[iCnt]);
    }
     Display(p,iLength);
   
    free(p);
    return 0;
}