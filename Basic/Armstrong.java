// Armstrong number is number that is equal to sum of cubes of its digit

import java.util.Scanner;

public class Armstrong
{   
    public static boolean CheckArmstrong1(int n)
    {
        boolean Ret = false;
        
        int temp = n;
        int Digit = 0;
        int CubeSum = 0;

        while( n > 0)
        {
            Digit = n % 10;
            n = n /10;
            CubeSum = CubeSum + (Digit * Digit *Digit);
        }

        if( temp == CubeSum)
        {
            Ret = true;
        }
        return Ret;
    }
    public static boolean CheckArmstrong2(int iNo)
     { 
        //First Count the Number of Digit
        int k = String.valueOf(iNo).length();

        int Num = iNo;
        int Sum = 0;

        while(Num > 0)
        {
            int idigit = Num % 10;
            Sum += Math.pow(idigit, k);
            Num = Num / 10;
        }
         return Sum == iNo ? true:false;

    }
    public static void main(String args[])
    {
        int No1 = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        No1 = sobj.nextInt();

        System.out.println(  CheckArmstrong1(No1));


    }
}