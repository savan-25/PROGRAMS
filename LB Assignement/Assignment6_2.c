#include<Stdio.h>

void Display(int iNo)
{
   switch(iNo)
   {
    case 1 :
      printf("one");
      break;
    case 2:
        printf("Two");
    break;
    case 3:
         printf("Three");
    break;
    case 4:
            printf("Four");
    break;
    case 5:
            printf("Five");
    break;
    case 6:
            printf("Six");
            break;
    case 7:
            printf("Seven");
    break;
    case 8:
             printf("Eight");
    break;
    case 9:
            printf("Nine");

    break;
    default:
    printf("Invalid NUmber");
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