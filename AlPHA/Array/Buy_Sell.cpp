
/*
 * Example 1:
Input:
 prices = [7,1,5,3,6,4]
Output:
 5
Explanation:
 Buy on day 2 (price = 1) and 
sell on day 5 (price = 6), profit = 6-1 = 5
 */ 

#include<iostream>
using namespace std;


class Profit
{
    public:

    // using the Brute Force approach
    int MaxProfit1(int Arr[],int iNo)
    {
        int Profit = 0;

        for(int iCnt = 0;iCnt<iNo;iCnt++)
        {
              for(int j = iCnt + 1;j<iNo;j++)
              {
                if( Arr[j] > Arr[iCnt])
                {
                    Profit = max(Profit,Arr[j] - Arr[iCnt]);
                }
              }
        }
        return Profit;
        
    }
    // using Single loop
    int MaxProfit2(int Arr[],int iNo)
    {
        int Profit = 0;
        int Min = Arr[0];

        for(int i = 1;i<iNo;i++)
        {
            int iCost = Arr[i] - Min;
            Profit = max(Profit,iCost);
            Min = min(Min,Arr[i]);
        }
        return Profit;
    }
};
int main()
{
    Profit pobj ;
    int Arr [] ={7,1,2,3,4,6};
    int n = 6;
    int iRet = pobj.MaxProfit2(Arr , n);

    cout<<"Maximum Profit is :"<<iRet;
    return 0;
}