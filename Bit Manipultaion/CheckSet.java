// Check ith bit is set or not
// use the left shift opertor and create mask

import java.util.Scanner;
public class CheckSet {
    public static boolean CheckSet(int iNo,int ipos)
    {
        int iMask = 1 << ipos;

        if((iMask & iNo) != 0)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int iNo = sobj.nextInt();

        System.out.println("Enther the bit psoition to Check");
        int ipos = sobj.nextInt();

        boolean bRet =CheckSet(iNo,ipos);

        System.out.println(bRet);


    }
}
