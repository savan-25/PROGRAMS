import java.util.Scanner;

class pattern1
{ 
    public static void Display(int N)
    {
      for(int i=0;i<N;i++)
      {
        for(int j=0;j<N;j++)
        {
            System.out.print("*");
        }
        System.out.println();
      }
    }
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the Value of rows");
        int No = sobj.nextInt();

        Display(No);
        
    }
} {
    
}
