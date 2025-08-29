// Q - using Recursion Returns the Summation of Array Element
// Arr[] = {1,2,3,4,5}   op - 15

public class Rec4 {

    public static int iSum(int Arr[],int n)
    {
        if(n <= 0)
        {
            return 0;
        }

        return Arr[n-1] + iSum(Arr, n-1);
    }
    public static void main(String[] args) {
        int Arr[] = {1,2,3,4,5};
        int iSize = Arr.length;

        int iRet = iSum(Arr,iSize);

        System.out.print("Summation of Array Element is  "+iRet);
    }
    
}
