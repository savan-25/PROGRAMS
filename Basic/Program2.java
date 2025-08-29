
//Java Program to Find the Largest Among Three Numbers

import java.util.Scanner;

public class Program2 {

    public static int LargestNum(int No1,int No2,int No3)
    {
        if(No1 > No2 && No1 > No3)
        {
            return No1;
        }
        else if( No2 > No1 && No2 > No3)
        {
            return No2;
        }
        return No3;
    }
    public static void main(String[] args) {
        int No1 = 0 , No2 = 0,No3 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        No1 = sobj.nextInt();

        System.out.println("Enter the Second Number ");
        No2 = sobj.nextInt();

        System.out.println("Enter the third Number : ");
        No3 = sobj.nextInt();


        int iRet = LargestNum(No1,No2,No3);

        System.out.println("Largest Number among threee Number is : "+iRet);
    }
}
