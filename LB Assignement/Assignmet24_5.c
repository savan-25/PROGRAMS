//  Display the below pattern
/* irow 4 icol 4
  Now we Apply one Special formula for Columns j=(iNo2-i+1)
  
   1 2 3 4
     2 3 4
       3 4
          4
*/
#include<stdio.h>
void Display(int iNo1,int iNo2)
{
   int i = 0;
   int j = 0;
 
  int iCnt=1;
    for(i=1;i<=iNo1;i++)
    {    
        for(j=1;j<=iNo2;j++)
        {   
           if(i<=j)
           {
            printf("%d\t",j);
           }
           else
           {
            printf("\t");
           }
           }
            printf("\n");
        }
        
}

int main()
{
    int iRow = 0;
    int iCol = 0;
    printf("Enter the Row:");
    scanf("%d",&iRow);

    printf("Enter the Col:");
    scanf("%d",&iCol);

    Display(iRow,iCol);
}