//   This Question is basically asked in Cognizent Company Assesment

import java.util.Scanner;

public class PalindromeNum {
    public static boolean CheckPali(int Num)
    {
        int temp = Num;
        int RevNum =0;

        int Digit = 0;
        int iVal = 0;
        while(Num > 0)
        {
            Digit = Num % 10;
            RevNum = RevNum*10 + Digit;
            Num = Num / 10;
        }

        return temp==RevNum;
    }
    public static void main(String[] args) 
    {
        int Num = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number :");
        Num = sobj.nextInt();
        
        bRet = CheckPali(Num);

        if(bRet)
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("Number is not Palindrome");
        }
        
        
        
    }
}
