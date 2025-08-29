import java.util.Scanner;


public class Secondlargest
{   
  public static void main(String args[])
  { 
    int iLength = 0;
    Scanner sc = new Scanner(System.in);
    Base bobj = new Base();

    System.out.print("Enter the Length of Array: ");
    iLength = sc.nextInt();

    int Arr[] =new int[iLength];
   
    System.out.println("Enter the Number:");
    for(int i = 0;i<iLength;i++)
    {
          Arr[i] = sc.nextInt(); 
       }
   
    int iRet = bobj.Large(Arr,iLength);

    
    System.out.println("lar"+iRet);
  }
}

   class Base{

    public int Large(int Arr[],int iSize)
    {
        int Max = -999;
        int Sec = -999;

        for(int i = 0;i<iSize;i++)
        {
         if(Arr[i] > Sec && Arr[i] != Max)
         {  
            Sec = Arr[i];
         }
         if(Arr[i]>Max)
         {  
          Sec = Max;
          Max = Arr[i];
         }
        
        }
      return Sec;
    }
}

