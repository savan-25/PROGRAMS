//write a program which accepts input From user
//and print even factor of that number

#include<stdio.h>

void Display()
{
    int iNo=12;
    if(iNo<=0)
    {
        iNo = -iNo;
    }
    for(int i = 0;i<iNo;i++)
    {
        if(iNo % i==0)
        {
            printf("%d , ",i);
        }
    }
}
int main()
{  
    // int iValue = 0;
    // printf("Enter the number \n");
    // scanf("%d ",&iValue);

    Display();

    return 0;
}