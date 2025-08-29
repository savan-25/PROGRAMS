 /*
      
        12345
        1234
        123
        12
        1
 */


public class pattern4 {
    public static void Display(int iRow,int iCol)
    {
        for(int i=0;i<iRow;i++)
        {
            for(int j=1;j<= (iRow-i);j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
         Display(5, 5);
    }
}

