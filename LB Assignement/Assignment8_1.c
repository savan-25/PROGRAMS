//Calculate The Area of Circle 

#include<stdio.h>

double CircleArea(float fRadius)
{
   int Area = 0.0;
   int PI = 3.14;

   Area = PI*(fRadius*fRadius);

   return Area; 


}
int main()
{   
    int fValue = 0.0;
    int dRet = 0.0;
    printf("Enter the Radius of Circel:");
    scanf("%f ",&fValue);

    dRet = CircleArea(fValue);

    printf("Area of Circle is: %d",dRet);
    return 0;
}