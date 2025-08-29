/*Q -Problem Statement – Vohra went to a movie with his friends in a Wave theatre and during  break time he bought pizzas, puffs and cool drinks. Consider   the following prices : 

Rs.100/pizza
Rs.20/puffs
Rs.10/cooldrink
Generate a bill for What Vohra has bought.

Sample Input 1:

Enter the no of pizzas bought:10
Enter the no of puffs bought:12
Enter the no of cool drinks bought:5
Sample Output 1:

Bill Details

No of pizzas:10
No of puffs:12
No of cooldrinks:5
Total price=1290
ENJOY THE SHOW!!!  */

import java.util.Scanner;

public class genc1 {

    public static int Bill(int A,int B,int C)
    {
        System.out.println("No of Pizzas"+A);
        System.out.println("No of Puffs"+B);
        System.out.println("No of cool drinks"+C);

        return A*100+B*20+C*10;

    }
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int noOfPizza = 0;
        int noOfPuffs = 0;
        int noOfCooldrinks = 0;
        int total_Prize = 0;

        System.out.println("Enter the number of pizzas bought :");
        noOfPizza = sobj.nextInt();

        System.out.println("Enter the number of puffs bought");
        noOfPuffs = sobj.nextInt();

        System.out.println("Enter the Number of cool drinks bought");
        noOfCooldrinks = sobj.nextInt();

        total_Prize = Bill(noOfPizza,noOfPuffs,noOfCooldrinks);

        System.out.println("Total Bill is:"+total_Prize);
        System.out.println("Enjoy the show");
        
    }
}
