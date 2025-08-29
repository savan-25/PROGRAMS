//  Display the below pattern
/* A B C D 
   a b c d
   A B C D 
   a b c d */
#include<stdio.h>
void Display(int iNo1,int iNo2)
{
   int i = 0;
   int j = 0;
    char ch1 = '\0';
    char ch2 = '\0';

    for(i=1 ,ch1='a';i<=iNo1;i++,ch1++)
    {
        for(j=1,ch2='A';j<=iNo2;j++,ch2++)
        { 
            if(i%2==0)
            {
                printf("%c",ch1);
            }
            else{
                printf("%c",ch2);
            }

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