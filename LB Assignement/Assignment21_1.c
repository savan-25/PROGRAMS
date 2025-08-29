// Accpet from user 
/*   Input row 4  col 4
   A B C D
   A B C D 
   A B C D
*/  

#include<stdio.h>

void Display(int iNo,int iNo2)
{    
    char ch = '\0';
      for(int i =1;i<=iNo;i++)
      {
        for(int j=1,ch='A';j<=iNo2;j++,ch++)
        {  
           printf("%c\t",ch);
        }
        printf("\n");
      }
}

int main()
{   
    int iValue1 = 0;
    int iValue2 = 0;
    printf("Enter the Row Value:");
    scanf("%d",&iValue1);
    printf("Enter the Column Value:");
    scanf("%d",&iValue2);
    Display(iValue1,iValue2);
}