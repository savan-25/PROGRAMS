/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
 */

import java.util.Scanner;


public class pattern8 {
    public static void Display(int No)
    {
        for(int i=1;i<=No;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int No = 0;
        System.out.println("Enter the Value of N");
        No = sobj.nextInt();

        Display(No);

    }
    
}
