//  Display the below pattern
/*   
    iRow = 3 
    iCol = 5
    A A A A A
    B B B B B
    C C C C C

   */
#include<stdio.h>
void Display(int iNo1,int iNo2)
{
   int i = 0;
   int j = 0;
    char ch = '\0';
    

    for(i=1 ,ch='A';i<=iNo1;i++,ch++)
    {
        for(j=1;j<=iNo2;j++)
        { 
            printf("%c\t",ch);

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