// convert a given Decimal number in binary format

import java.util.Scanner;

public class DecimaltoBinary {
       
    public static String Convert(int iNo)
    {
        String str = "";

        while(iNo != 1)
        {
            if(iNo %2 ==1)
            {
                str +="1";
            }else{
                str +="0";
            }
            iNo = iNo/2;
        }
        return str;
    }
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Enter the Number : ");
        iNo = sobj.nextInt();

        String sRet = Convert(iNo);

        System.out.println(sRet);
    }
    
}
