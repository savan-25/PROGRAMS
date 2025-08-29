//2.3 Accept one Number from User and if this Number less than 
//Zero then print Hello otherwise print Demo

#include<stdio.h>

void Display(int iNo)
{
   if(iNo<10){
    printf("Hello");
   }
   else{
    printf("Demo");
   }
}
int main()
{ int iValue = 0;
  printf("Enter the Number:");
  scanf("%d",&iValue);

  Display(iValue);
  return 0;
}