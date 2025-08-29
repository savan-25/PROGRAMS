//  Display the below pattern
/* irow 5 icol 5

   a b c d e
   1 2 3 4 5
   a b c d e
   1 2 3 4 5
   a b c d e
   */
#include<stdio.h>
void Display(int iNo1,int iNo2)
{
   int i = 0;
   int j = 0;
   char ch = '\0';

    for(i=1;i<=iNo1;i++)
    {
        for(j=1,ch='a';j<=iNo2;j++,ch++)
        {   
           if(i%2!=0)
           {
            printf("%c\t",ch);
           }
           else if(i%2==0)
           {
            printf("%d\t",j);
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