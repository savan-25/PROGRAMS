//Q- Accept Number From user and check the frequency of that number in array
#include<stdio.h>
#include<stdbool.h>
#include<stdlib.h>

bool Check(int Arr[],int iSize,int No)
{   
    bool flag =0;
    for(int iCnt=0;iCnt<iSize;iCnt++)
    {
        if(No == Arr[iCnt])
        {
           flag =1;
        }
    }

return flag;
}
int main()
{  
    int iLength =0,iCnt = 0,Number=0;
    bool iRet = false;
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

    
    if(Check(p,iLength,Number)==1)
    {
        printf("Number is Present");
    }
    else{
        printf("Number is Not Present");
    }
    free(p);



    return 0;
}