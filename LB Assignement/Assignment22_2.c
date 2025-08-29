//  Display the below pattern
/* irow 4 icol 4
   2 4 6 8 10
   1 3 5 7 9
   2 4 6 8 10
   1 3 5 7 9*/
#include<stdio.h>
void Display(int iNo1,int iNo2)
{
   int i = 0;
   int j = 0;


    for(i=1;i<=iNo1;i++)
    {
        for(j=1;j<=iNo2;j++)
        {   
            if(i%2!=0)
            {
            printf("%d\t",j*2);  
            } 
            else
            {
                printf("%d\t",j*2-1);
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