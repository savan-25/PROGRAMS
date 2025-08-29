//Q Accept the N  Number from User and display Summation of digit of each number;
#include<stdio.h>
#include<stdlib.h>

void DigitsSum(int Arr[],int iSize)
{
    int iDigit =0;
    
    int iCnt = 0;
   
      while(iCnt<iSize){
        int iSum = 0;
        while(Arr[iCnt]>0)
        {     
            iDigit =  Arr[iCnt] % 10;
            iSum = iSum + iDigit;

            Arr[iCnt] = Arr[iCnt] /10;
        }
        printf("%d  ",iSum);
        iCnt++;
      }
    

}

int main()
{  
    int iLength = 0, iCnt = 0 , iRet = 0;
    int *p = NULL;

    printf("Enter the Number of Elements You Want to Add: ");
    scanf("%d",&iLength);
    
    p = (int *) malloc (iLength * sizeof(int*));

    if(p==NULL)
    {
        printf("Unable to Allocate the Memory:");
        return -1;
    }

    printf("Enter the Number :");
    for(iCnt = 0;iCnt<iLength;iCnt++)
    {
        scanf("%d",&p[iCnt]);
    }

    DigitsSum(p,iLength);
    return 0;
}