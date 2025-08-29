//Q - Summation of n element using recursion 

import java.util.Scanner;

public class Rec3 {
      
    public static int nSum(int No)
    {
        if( No < 1)
        {
            return 0;
        }

        return No+nSum(No-1);
        
    }
    public static void main(String args[])
    {
        int N = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Value of N");
        N= sobj.nextInt();

        int iRet = nSum(N);

        System.out.println("Summation of First n Number is : "+iRet);
        }
    
}
