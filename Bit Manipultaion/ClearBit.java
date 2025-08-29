// Clear the ith bit

import java.util.Scanner;

public class ClearBit {
    public static int Clear(int no,int ipos)
    {
        int iMask = ~(1 << ipos);

        return no & iMask;
    }
    public static void main(String[] args) {
       Scanner sobj = new Scanner(System.in);

    int no = 0;
    int ipos = 0;

    System.out.println("Enter the Number :");
    no = sobj.nextInt();

    System.out.println("Enter the position");
    ipos = sobj.nextInt();

    int iRet = Clear(no,ipos);
    
     System.out.println("in binary Format"+Integer.toBinaryString(no));
    System.out.println("Number After set bit "+iRet);
    System.out.println("in binary Format"+Integer.toBinaryString(iRet)); 
    }
}
