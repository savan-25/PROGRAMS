// Actual 9 Number Assignment Get Reapeted but we solve int Again
#include<stdio.h>

// Write A program which Accept radius From User and Calculate
//Area consider value of Pi is 3.14
double CircleArea(float fRadius)
{    double iArea = 0;
    float PI = 3.14;
    iArea = fRadius*fRadius*PI;

    return iArea;

}
int main()
{   
    float fValue = 0;
    double dResult = 0;

    printf("Enter The Radius Of Circle\n");
    scanf("%f",&fValue);

    dResult = CircleArea(fValue);
    printf("Area Of Circle is: %lf",dResult);
    return 0;
}