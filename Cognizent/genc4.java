/*Problem Statement  – In a theater, there is a discount scheme announced where one gets a 10% discount on the total cost of tickets when there is a bulk booking of more than 20 tickets, and a discount of 2% on the total cost of tickets if a special coupon card is submitted. Develop a program to find the total cost as per the scheme. The cost of the k class ticket is Rs.75 and q class is Rs.150. Refreshments can also be opted by paying an additional of Rs. 50 per member.

Hint: k and q and You have to book minimum of 5 tickets and maximum of 40 at a time. If fails display “Minimum of 5 and Maximum of 40 Tickets”.  If circle is given a value other than ‘k’ or ‘q’ the output should be “Invalid Input”.

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

Minimum of 5 and Maximum of 40 Tickets */

import java.util.Scanner;

public class genc4 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        
        int ticketCount = 0;
        char refreshment ='\0' , couponcode = '\0' ,circle = '\0';
        int cost =0;

        System.out.println("Enter the Number of tickets : ");
        ticketCount = sobj.nextInt();

        System.out.println("Do you want refreshement(y/n) : ");
        refreshment = sobj.next().charAt(0);
        

    }
}
/*
 import java.util.Scanner;

public class Practice {

    public static double calculateTicketCost(int ticketCount, char refreshment, char couponCode, char circle) {
        // Constants
        final int K_TICKET_PRICE = 75;
        final int Q_TICKET_PRICE = 150;
        final int REFRESHMENT_COST = 50;

        // Validate ticket count
        if (ticketCount < 5 || ticketCount > 40) {
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
            return -1;
        }

        // Validate circle
        if (circle != 'k' && circle != 'q') {
            System.out.println("Invalid Input");
            return -1;
        }

        // Calculate base ticket cost
        int ticketPrice = (circle == 'k') ? K_TICKET_PRICE : Q_TICKET_PRICE;
        double totalCost = ticketCount * ticketPrice;

        // Apply bulk discount if applicable
        if (ticketCount > 20) {
            totalCost -= totalCost * 0.10; // 10% discount
        }

        // Apply coupon discount if applicable
        if (couponCode == 'y') {
            totalCost -= totalCost * 0.02; // 2% discount
        }

        // Add refreshment cost if selected
        if (refreshment == 'y') {
            totalCost += ticketCount * REFRESHMENT_COST;
        }

        return totalCost;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of tickets: ");
        int ticketCount = scanner.nextInt();

        System.out.print("Do you want refreshment (y/n): ");
        char refreshment = scanner.next().toLowerCase().charAt(0);

        System.out.print("Do you have coupon code (y/n): ");
        char couponCode = scanner.next().toLowerCase().charAt(0);

        System.out.print("Enter the circle (k/q): ");
        char circle = scanner.next().toLowerCase().charAt(0);

        double cost = calculateTicketCost(ticketCount, refreshment, couponCode, circle);

        if (cost != -1) {
            System.out.printf("Ticket cost: %.2f\n", cost);
        }

        scanner.close();
    }
}

 */