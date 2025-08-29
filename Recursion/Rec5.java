/*Implement Pow(x,n) | X raised to the power N */

/*Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000
Explanation: You need to calculate 2.00000 raised to 10 which gives ans 1024.00000

Example 2:
Input: x = 2.10000, n = 3
Output: 9.26100
Explanation: You need to calculate 2.10000 raised to 3 which gives ans 9.26100 */

import java.util.Scanner;

public class Rec5 {

    public static double Pow(double No,int x)
    {
        if(x == 0)
        {
            return 1;

        }

        return No* Pow(No, x-1);
    }
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        double No = 0 ;int  x = 0;
       System.out.println("Enter the base value : ");        
        No = sobj.nextDouble();

        System.out.println("Enter the power value : ");
        x = sobj.nextInt();

        double iRet = Pow(No,x);

        System.out.println(iRet);
    }
    
}
