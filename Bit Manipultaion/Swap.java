import java.util.Scanner;

class Swap
{  
    public static int add(int no1,int no2)
    {
        no1 = no1^no2;
        no2 = no1^no2;
        no1 = no1^no2;
    }
    public static void main(String args[])
    {
        int no= 0;
        int no2 = 0;

        Scanner sobj = new Scanner(System.in);

        no = sobj.nextInt();
        no2 = sobj.nextInt();

        int iRet = add(no,no2);

        System.out.println("Addition of two number is : "+iRet);
    }
}