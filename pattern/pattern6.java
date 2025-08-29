import java.util.Scanner;

public class pattern6 {
    public static void Display(int no)
    {
        for(int i=1;i<=no;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i%2 != 0)
                {
                    if(j%2 != 0)
                    {
                        System.out.print("1\t");
                    }
                    else
                    {
                        System.out.print("0\t");
                    }
                }
                else
                {
                    if(j%2 != 0)
                    {
                        System.out.print("0\t");
                    }
                    else
                    {
                        System.out.print("1\t");
                    }
                }
            }
            System.out.println();
           
        }
    }
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the value of no");
        int no = sobj.nextInt();

        Display(no);
        
    }
    
}
