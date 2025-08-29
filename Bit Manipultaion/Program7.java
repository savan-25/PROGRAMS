import java.util.Scanner;
/*Given an integer n, return true if it is a power of two. Otherwise, return false.
An integer n is a power of two if there exists an integer x such that n == 2x.
You must solve it without using loops or recursion. */


public class Program7 {
    public static boolean Checkpow(int ino)
    {
        if(ino <= 0)
        {
           return false;
        }

        if(((ino-1) & ino) ==0)
        {
            return true;
        }
        return false;

    }
    
    public static boolean Checkpow2(int ino)
    {   
        if (ino <= 0)
        {
            return false;
        }
        if(ino == 1)
        {
            return true;
        }
        if(ino % 2 != 0)
        {
            return false;

        }
        return Checkpow(ino/2);
    }
    //using loop
   

    public static void main(String[] args) {
    Scanner sobj = new Scanner(System.in);

    int no = 0;
    
    System.out.println("Enter the Number :");
    no = sobj.nextInt();
    boolean bRet = Checkpow3(no);

    System.out.println(bRet);
    }
    
}
