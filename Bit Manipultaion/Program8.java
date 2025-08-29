/* Check the Given Number is Power of 2 */

import java.util.Scanner;

public class Program8 {
    
    // Using Recursive way
    public static boolean Check2Power(int iNo)
    {
       if(iNo == 1)
       {
        return true;
       }
       else if(iNo % 2 != 0 || iNo <= 0)
       {
        return false;
       }

       return Check2Power(iNo/2);
    }
   
    // Using For loop
    public static boolean Check2Pow(int iNo)
    {
        for(int i=0;i<=Math.sqrt(iNo);i++)
        {
            int Num = (int)Math.pow(2, i);

            if(Num == iNo)
            {
                return true;
            }
        }
        return false;

    }

    // Using Bitwise Operator
    // it is Fastest way to check
    public static boolean Check(int iNo)
    {
        return (iNo > 0 )&& ((iNo & (iNo-1)) == 0);
    }
    public static void main(String[] args) {
        
        int iNo = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number :");
        iNo = sobj.nextInt();

        bRet = Check2Power(iNo);

        if(bRet)
        {
            System.out.println("Number is Power of 2");
        }
        else{
            System.out.println("Number is Not Power of 2");
        }
    }
}
