/*
        *****
        ****
        ***
        **
        *
 */


public class pattern3 {
    public static void Display(int iRow,int iCol)
    {
        for(int i=0;i<iRow;i++)
        {
            for(int j=1;j<= (iRow-i);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
         Display(5, 5);
    }
}



