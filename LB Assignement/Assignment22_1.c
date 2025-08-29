//  Display the below pattern
/* irow 4 icol 4
   1 2 3 4 
   5 6 7 8 
   9 1 2 3
   4 5 6 7*/
#include<stdio.h>
void Display(int iNo1,int iNo2)
{
   int i = 0;
   int j = 0;
   int iCnt =1;

    for(i=1;i<=iNo1;i++)
    {
        for(j=1;j<=iNo2;j++,iCnt++)
        {   if(iCnt>=10){
            iCnt=1;
            }
            
            
                printf("%d\t",iCnt);
            
            

        }
        printf("\n");
    }
}
int main()
{
    int iRow = 0;
    int iCol = 0;
    printf("Enter the Column:");
    scanf("%d",&iRow);

    printf("Enter the Row:");
    scanf("%d",&iCol);

    Display(iRow,iCol);
}