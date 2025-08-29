#include<Stdio.h>

int main()
{ 
   int iNo = 0;
   printf("Enter the number  ");
   scanf("%d",&iNo);

   if(iNo % 2== 0)
   {
      printf("Number is Even");
   }
   else
   {
      printf("Number is Odd");
   }
}