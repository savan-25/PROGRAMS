/*
   Day 25 coding Statement : Write a program to find Area of a circle
Description

Get the value for radius from the user and calculate the area of the circle for the given radius.

Area of circle = 3.14*radius*radius

Input

3

Output

28.2
 */

import java.util.Scanner;

public class Day25 {
    public static double CircleArea(int Rad)
    {
        
        return 3.14*Rad*Rad;
    }
    public static void main(String[] args) {
        int Radius = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Radius");
        Radius = sobj.nextInt();

        double iArea = CircleArea(Radius);

        System.out.println("Area of Circle is :"+iArea);
    }
}
