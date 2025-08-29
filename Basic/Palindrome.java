import java.util.Scanner;
public class Palindrome 
{   
    public static boolean isPalindrome(int Num)
    {
        int temp = Num;
        int Rev = 0;
        int Digit = 0;

        while( Num > 0)
        {
            Digit = Num % 10;
            Rev = Rev*10+Digit;
            Num = Num / 10;
            
        }
        return Rev == temp;
    }
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int No1 = sobj.nextInt();

        if(isPalindrome(No1))
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("Given Number is not palindrome");
        }

        
    }
    
}
