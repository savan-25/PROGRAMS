// Print the name n time using backtracking

import java.util.Scanner;

public class Rec1 { 
    static int iCount = 1;
    public static void PrintNameN(int N)
    {
        if(iCount <= N)
        {
            System.out.println("Savan");
            iCount++ ;
            PrintNameN(N);
        }
        
    }
    //without Static
    public static void PrintName(int N,int i)
    {
        if(i > N)
        {
          return;
        }

        System.out.println(i);
        PrintName(N, i+1);
    }
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        int N = sobj.nextInt();

        PrintName(N,1);


    }
    
}
