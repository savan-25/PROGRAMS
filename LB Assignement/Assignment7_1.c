#include<stdio.h>

void Display(int iNo)
{
    for(int i =0;i<iNo;i++)
    {
        for(int j=0;j<iNo;j++){
        printf("* ");
        }
        printf("#");
    }
}
int main()
{ 
    int iValue = 0;
    printf("Enter the Number:");
    scanf("%d ",&iValue);

    Display(iValue);
    return 0;
}