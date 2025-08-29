/*
 * Problem Statement – Write a program to calculate the fuel consumption of your truck.The program should ask the user to enter the quantity of diesel to fill up the tank and the distance covered till the tank goes dry.
 * Calculate the fuel consumption and display it in the format (liters per 100 kilometers).
Convert the same result to the U.S. style of miles per gallon and display the result. If the quantity or distance is zero or negative display ” is an Invalid Input”.
[Note: The US approach of fuel consumption calculation (distance / fuel) is the inverse of the European approach (fuel / distance ).
 Also note that 1 kilometer is 0.6214 miles, and 1 liter is 0.2642 gallons.]
The result should be with two decimal place.To get two decimal place refer the below-mentioned print statement :

float cost=670.23;

System.out.printf(“You need a sum of Rs.%.2f to cover the trip”,cost);

Sample Input 1:
Enter the no of liters to fill the tank
           20
Enter the distance covered
           150
Sample Output 1:
Liters/100KM
          13.33
Miles/gallons
          17.64
 */
import java.util.Scanner;
public class genc5 {
    public static void main(String args[])
   {
    // Create the object of Scanner class for accepting input
    Scanner sobj = new Scanner(System.in);

    //take no of liter and distance
    System.out.println("Enter the no of liter fill the tank");
    double liters = sobj.nextDouble();

    // enter the distance
    System.out.println("Enter the distance");
    double distance = sobj.nextDouble();

    // input validation
    if(liters <= 0 || distance <= 0)
    {
        System.out.println("is an Invalid input");
    }

    // Fuel Consumption
    double litersper100Km = (liters/distance)*100;

    // Conversion to US style
    double miles = distance*0.6214;
    double gallons = liters*0.2642;
    double milespergallon = miles/gallons;

    // print the result in formatted form 
    System.out.println("Liters/100KM");
    System.out.printf("%.2f\n",litersper100Km);

    System.out.println("Miles/gallons");
    System.out.printf("%.2f\n",milespergallon);

    sobj.close();
   }
    
}
