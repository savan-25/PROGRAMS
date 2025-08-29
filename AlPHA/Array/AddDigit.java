/*258. Add Digits

Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

Example 1:

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.
Example 2:

Input: num = 0
Output: 0
  */
public class AddDigit {

    public static int addDigits(int num)
    {
         if(num == 0)
        {
         return 0;   
        }

        return (num%9 == 0)?9:num%9;
    }
    public static void main(String[] args) {
        int num = 38;

        //use the 9 number divisiblity rule

       int iRet = addDigits(num);

       System.out.println(iRet);

    }
}
