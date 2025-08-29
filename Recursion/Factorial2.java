/*
      A number n is called a factorial number if it is the factorial of a positive integer. 
      For example, the first few factorial numbers are 1, 2, 6, 24, 120,
      Given a number n, the task is to return the list/vector of the factorial
      numbers smaller than or equal to n.

      Input: n = 3
      Output: 1 2
      Explanation: The first factorial number is 1 which is less than equal to n. 
      The second number is 2 which is less than equal to n,but the third factorial number is 6 which is 
      greater than n. So we print only 1 and 2.
 */
import java.util.ArrayList;

class Factorial2
{   
   public static ArrayList<Integer> Fact(int n)
   {  
      ArrayList<Integer> list = new ArrayList<>();
      int i = 1;
      int ifact = 1;

      while( ifact <= n)
      {
          list.add(ifact);
          i++;
          ifact = ifact * i;
      }

      return list;
   }
   public static void main(String[] args) {
     System.out.println(Fact(3));  
   }
}
