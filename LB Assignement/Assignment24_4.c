//  Display the below pattern
/* irow 5 icol 5
  
   * * * * *
   * *     *
   *   *    *
   *      * *
   * * * * *
   
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
         
         if(i==1 ||i==iNo1 || j==1 ||j==iNo2 || i==j)
           {
            printf("*\t");
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