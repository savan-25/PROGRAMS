/*
 Problem Statement  – 
 In a theater, there is a discount scheme announced where one gets a 10% discount on the total cost
of tickets when there is a bulk booking of more than 20 tickets, and a discount of 2% on the total cost of tickets if a special coupon card is submitted. 
Develop a program to find the total cost as per the scheme. The cost of the k class ticket is Rs.75 and q class is Rs.150.
 Refreshments can also be opted by paying an additional of Rs. 50 per member.
Hint: k and q and You have to book minimum of 5 tickets and maximum of 40 at a time. If fails display “Minimum of 5 and Maximum of 40 Tickets”.  
If circle is given a value other than ‘k’ or ‘q’ the output should be “Invalid Input”.
The ticket cost should be printed exactly to two decimal places.

Sample Input 1:
Enter the no of ticket:35
Do you want refreshment:y
Do you have coupon code:y
Enter the circle:k
Sample Output 1:

Ticket cost:4065.25
Sample Input 2:
Enter the no of ticket:1
Sample Output 2:

Minimum of 5 and Maximum of 40 Tickets
 */
import java.util.Scanner;
class Practice
{
    public static int ticketCost(int iNo,char ref,char coup ,char cir)
    {
        int totalCost = 0;
        int refreshments = 0;
        int discount = 0;

         if(iNo < 5  iNo >= 40)
        {
            System.out.println("Minimum of 5 and Maximum of 40 Tickets ");
        }
        if(ref != 'y' && ref != 'n')
        {
          System.out.println("Invalid");
        }
        if(cir != 'k' && cir != 'q')
        {
            System.out.println("Invalid Input");
        } 
        if(cir == 'k')
        {
            totalCost = iNo*75;
        }
        else{
            totalCost = iNo*150;
        }
        

        if(iNo >= 20 )
        {
            discount = ((totalCost*10)/100);

            totalCost = totalCost-discount;
        }
        if(coup == 'y')
        {
            discount = ((totalCost*2)/100);

            totalCost = totalCost -discount;
        }

       
        if(ref == 'y')
        {
            refreshments = iNo*50;
        }

        return totalCost+refreshments;
    }
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        
        int ticketNo = 0;
        char refreshment = '\0';
        char couponCode = '\0';
        char circle = '\0';


        System.out.println("Enter the Number of ticket : ");
        ticketNo = sobj.nextInt();

        System.out.println("Do you want refreshment : ");
        refreshment = sobj.next().charAt(0);

        System.out.println("Do you have Coupon code : ");
        couponCode = sobj.next().charAt(0);

        System.out.println("Enter the circle : ");
        circle = sobj.next().charAt(0);

        int iRet = ticketCost(ticketNo,refreshment,couponCode,circle);

        System.out.printf("%.2f\n : "+iRet);
    }
}