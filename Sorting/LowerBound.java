public class LowerBound {
 
    public static int  LBound(int Arr[],int x,int n)
    {    
        int Ans = 0;
        for(int i=0;i<n;i++)
        {
            if(Arr[i] >= x)
            {
              Ans++;
            }
        }
        return Ans;
    }
    public static int LBound2(int Arr[],int x)
    {
        int low = 0;
        int high = Arr.length-1;

        while(low < high)
        {
            int mid = (low+high)/2;

            if(Arr[mid] <= x)
            {
                low = mid+1;

            }else
            {
                high = mid;
            }
        }
        return low;
    }
    public static void main(String args[])
    {
        int Arr[] ={3,5,8,15,19};

        int x = 9;

        int ind = LBound(Arr, x,5);

        System.out.println(ind);

    }
}
