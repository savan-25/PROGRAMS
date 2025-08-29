#include<stdio.h>

double RactArea(float fWidth,float fHeight)
{
     double Area = 0;

    Area = fWidth* fHeight;

    return Area;
}
int main()
{   
    int fValue1 = 0,fValue2 = 0;
    double dRet = 0.0;
    printf("Enter The Width of Rectangle: ");
    scanf("%f",&fValue1);
    printf("Enter the Height of Rectangle :");
    scanf("%f ",&fValue2);

    dRet = RactArea(fValue1,fValue2);

    printf("Area of Rectangle is:%lf",dRet);
    return 0;
}