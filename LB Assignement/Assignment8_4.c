//Write A program Which Accept temperatire in Fahrenheit and convert it itno celcius
//1 celcius = (fahrenheit-32)*(5/9))

#include<stdio.h>

double FhtoCs(float fTemp)
{
    double Result = 0;
    Result = ((fTemp-32) * (5/9));

    return Result;
}
int main()
{  
    float fValue = 0;
    double dRet = 0.0;

    printf("Enter the Temperature in Fahrenhiet:");
    scanf("%f",&fValue);

    dRet = FhtoCs(fValue);

    printf("%f  is equal to %lf",dRet );
    return 0;

}