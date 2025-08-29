/*
 * Day 14 coding Statement : Write a program to reverse a given number

Description

Get an input from the user and the print the reverse of the given number as the output
E.g. let the number be 324 then the reverse of the number is 423
Input
675
Output
576
 */

 /*
  * So for Reversing Number Logic is extract the last Digit, and then i build the
  Steps 1 : take one variable as Reverse num 
  step2 : Extract digit from number
  step : Reverse num by 10 + Digit
  step 4: Actualnum/10
  reversed Number b
  */
import java.util.Scanner;

public class Day14 {
    public static int RevNum(int iNo)
    {
        int Reversed = 0;
        int Digit = 0;

        while(iNo > 0)
        {
            Digit = iNo % 10;
            Reversed = Reversed*10+Digit;
            iNo = iNo / 10;
        }
        return Reversed;
    }
    public static void main(String[] args) {
        int iNo = 0;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Number :");
        iNo = sobj.nextInt();

        int iRet = RevNum(iNo);

        System.out.println(iNo+" Number After Reverse "+iRet);
    }
    
}
/*
 * What you can add to make it even better (if needed):
Time & Space Complexity

"Time complexity is O(log₁₀N) because we divide the number by 10 in each step. Space complexity is O(1) since we only use a few variables."

Handling Negative Numbers (Bonus)

"We can store the sign separately and apply the reverse logic to the absolute value."

✅ Sample Final Wrap-Up (How to end it confidently):
“So overall, the problem is solved using basic arithmetic operations in a loop, and it's efficient in terms of time and space.”


 */