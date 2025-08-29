/*
 * Day 7 coding Statement:  Write a program to find Number of days in a given month of a given year

Description

Get the number of month and year as input from the user and check the number of days present in that month.
Input
Enter month : 2
Enter year : 2000
Output
29
 */


        import java.util.Scanner;

public class Day7 {

    public static int DaysCalculate(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    return 29; // Leap year
                } else {
                    return 28;
                }
            default:
                return -1; // Invalid month
        }
    }

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Month (1-12): ");
        int month = sobj.nextInt();

        System.out.print("Enter the Year: ");
        int year = sobj.nextInt();

        int days = DaysCalculate(month, year);

        if (days == -1) {
            System.out.println("Invalid month entered.");
        } else {
            System.out.println("Days in month " + month + " of year " + year + " is: " + days);
        }
    }
}
