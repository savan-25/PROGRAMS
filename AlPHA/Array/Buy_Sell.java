
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

public class Buy_Sell {

    // this is not clear all the Cases
    public static int MaxProfit(int Arr[])
    {
        int Ans = 0;
        int max = 0;
        int min = 99999;
        int index = 0;

        for(int i = 0;i<Arr.length;i++)
        {
            if(Arr[i] < min)
            {
                min = Arr[i];
                index = i;
                

            }
        }

        for(int i=index ;i<Arr.length;i++)
        {
            if(Arr[i] > max)
            {
                max =Arr[i];

            }
        }
        return max - min;
    }
    // Approach 1 : Brute Force
    public static int MaxProfit2(int Arr[])
    {
        int MaxProfit = 0;

        for(int i = 0;i<Arr.length;i++)
        {
            for(int j=i+1;j<Arr.length;j++)
            {
                if(Arr[j] > Arr[i])
                {
                    MaxProfit = Math.max(Arr[j]-Arr[i],MaxProfit);
                }
            }
        }
        return MaxProfit;
    }
    //Approach 2 : 
    public static int MaxProfit1(int Arr[])
    {
        int MaxProfit = 0;
        int min = Arr[0];

        for(int i =1;i<Arr.length;i++)
        {
            int Cost = Arr[i] - min;
            MaxProfit = Math.max(MaxProfit, Cost);
            min = Math.min(Arr[i],min);
        }
        return MaxProfit;
    }

    public static void main(String[] args) {

        int Arr[] = {7,1,5,3,6,4};

        int iRet = MaxProfit1(Arr);
        System.out.println(iRet);
    }
    
}
