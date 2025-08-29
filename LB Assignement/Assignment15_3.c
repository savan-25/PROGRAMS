//Q- Accept Number From user and accept one Another Number as No And Return the 
//Last occurence of that No

#include<stdio.h>
#include<stdlib.h>

int LastOcc(int Arr[],int iSize,int No1)
{  
    int iCnt = 0;
    int temp =-1;
    for( iCnt=0;iCnt<iSize;iCnt++)
    {
        if(No1==Arr[iCnt])
        {  
         temp = iCnt;
        
        }
    }
    
    if(temp==-1)
    {
        return -1;
    }
    return temp;
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

    
    iRet=LastOcc(p,iLength,Number);
    if(iRet==-1)
    {
        printf("There is No Such Number Present:");
    }
    else{
    printf("First Occurence index is:%d",iRet);
    
    }free(p);



    return 0;
}