import java.util.Scanner;

// Remove Last Set bit
// ip N = 12 -> 1100 op : 1000

//use the trick n & (n-1)
public class Program6 {
   public static int RemoveLastSet(int no)
   {
      return no & (no-1);
   }
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

    int no = 0;
    int ipos = 0;

    System.out.println("Enter the Number :");
    no = sobj.nextInt();

   

    int iRet = RemoveLastSet(no);
    
     System.out.println("in binary Format"+Integer.toBinaryString(no));
    System.out.println("Number After set bit "+iRet);
    System.out.println("in binary Format"+Integer.toBinaryString(iRet));
    }
}
