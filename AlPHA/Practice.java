import java.util.Scanner;

class Practice
{
  public static void main(String[] args) {
   // accept the number from user and check the number is divisible by 5

   Scanner sobj = new Scanner(System.in);

   System.out.println("Enter the number");
   int ino = sobj.nextInt();

   if(ino < 0)
   {
    System.out.println("Hello");
   }else{
    System.out.println("Demo");
   }
  }
}