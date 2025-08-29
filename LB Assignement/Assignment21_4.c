//  Display the below pattern
/*  row 4 col 5
4 4 4 4 4
3 3 3 3 3
2 2 2 2 2
1 1 1 1 1  */
#include<stdio.h>
void Display(int iNo1,int iNo2)
{
   int i = 0;
   int j = 0;
    

    for(i=iNo1 ;i>=1;i--)
    {
        for(j=iNo2;j>=1;j--)
        { 
            printf("%d\t",i);

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