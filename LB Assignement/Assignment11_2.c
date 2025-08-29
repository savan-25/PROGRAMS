// Q- Write w Program Which Accept From User And Check Wheter it 
//Containd 0 Or Not In It. ->Chek Function Return Value Should Be BOOl
#include<stdio.h>
#include<stdbool.h>

#define TRUE 1
#define FALSE 0

bool CheckZero(int iNo){
    int iDigit = 0;
    if(iNo < 0)
    {
        iNo = -iNo ;
    }
    while(iNo>0)
    {
    
        iDigit = iNo%10;
        if(iDigit==0)
        {
            return true;
        }
        iNo = iNo / 10;
    }
}
int main()
{
    int iValue = 0;
    printf("Enter the Number : \n");
    scanf("%d ",&iValue);

    if(CheckZero(iValue) == true)
    {
        printf("It Contains Zero in it");
    }
    else{
        printf("There is No Zero");
    }
}

