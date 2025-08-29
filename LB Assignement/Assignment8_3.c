// Write A Program Which Accept Distence in Kilometer and Convert it into meter
// 1 Kilometer = 1000 meter
#include<stdio.h>

int KMtoMeter(int iNo)
{
   int meter = 0;
   meter = iNo *1000;

   return meter;
}
int main()
{   int iValue = 0;
 int  dRet = 0;
   printf("Enter the Distance in kilometer:");
   scanf("%d ",&iValue);
   
   dRet = KMtoMeter(iValue);

   printf("%d KM is Equal to %d meter",iValue,dRet);

    return 0;
}