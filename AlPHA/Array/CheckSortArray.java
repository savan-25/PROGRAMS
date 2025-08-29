import java.util.Scanner;
class CheckSortArray
{ 
    // Using Method 1
  public static boolean SortArr(int Arr[])
  {
    boolean bRet = true;

    for(int i=0;i<Arr.length;i++)
    {
      for(int j=i+1;j<Arr.length;j++)
      {
        if(Arr[i] > Arr[j])
        {
          bRet = false;
        }
      }

    }
    return bRet;
  }
  //Using Method 2
  public static boolean SortArr2(int Arr[])
  {
    boolean bRet = true;
   
     for(int i=1;i<Arr.length;i++)
    { 
      
        if(Arr[i] < Arr[i-1])
        {
            bRet = false;
        }
      }
      return bRet;

  }
  public static void main(String args[])
  { 
     Scanner sobj = new Scanner(System.in);

    System.out.print("Enter the Size of An Array : ");
    int n = sobj.nextInt();
 
    int Arr[] = new int[n];
  
   
    System.out.print("Enter the Element : ");
    for(int i=0;i<n;i++)
    {
      Arr[i] = sobj.nextInt();
    }
     System.out.print("Elements of an Array are : ");
    for(int i=0;i<n;i++)
        {
          System.out.println(Arr[i]+"\t");
    }

    System.out.println(SortArr2(Arr));


  }
}