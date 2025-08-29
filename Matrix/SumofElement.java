public class SumofElement {
    public static int SumofElement(int iRow,int iCol,int Arr[][])
    {
        int iSum  = 0;

        for(int i=0;i<iRow;i++)
        {
         for(int j=0;j<iCol;j++)
         {
            iSum += Arr[i][j];
         }
        }

        return iSum;
    }
    public static void main(String args[])
    {  
        int iRet = 0;
        int Arr[][] =
        { {1,2,3},{4,5,6},{7,8,9}};

        int N = 3;
        int M = 3;

        iRet  = SumofElement(N,M,Arr);

        System.out.println("Summation of Array element is : "+iRet);

    
    }
    
}
