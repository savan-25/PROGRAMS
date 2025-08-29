//Q Accept N number from user and accept one another number as No
//and returns the index of First Occurence of that No
#include<stdio.h>
#include<stdlib.h>

int FirstOcc(int Arr[],int iSize,int No1)
{  
    for(int iCnt=0;iCnt<iSize;iCnt++)
    {
        if(No1==Arr[iCnt])
        {
            return iCnt;
            break;
        }
        
    }
    return -1;
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
    printf("Enter the number You Want to Search: ");
    scanf("%d",&Number);

    
    iRet=FirstOcc(p,iLength,Number);
    printf("First Occurence index is:%d",iRet);
    free(p);



    return 0;
}