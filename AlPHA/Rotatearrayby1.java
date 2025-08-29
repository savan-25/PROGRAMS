import java.util.Scanner;

class RotateArrayby1
{  
  public static int[] Firstapproach(int Arr[],int n)
  {
    //time Complexity O(n)
    // Space Complexity O(n)
   int i = Arr.length - 1;
   int j = Arr.length;
   int brr[] = new int[n];

   for(int iCnt = 0;iCnt < Arr.length;iCnt++)
   { 
       int pos = ((iCnt + i) % j);
       brr[pos] = Arr[iCnt];
   }

   return brr;
  }
  public static int[] Secondapproach(int Arr[],int n,int r)
  {    
    // time complexity O(n)
    // space complexity O(1)  // if ask how much in algo then O(n)
    int temp = Arr[0];
    for(int i = 1;i<Arr.length ;i++)
    {
      Arr[i-1] = Arr[i];
    }
    Arr[n-1] = temp;
    return Arr;
  }
  public static void main(String args[])
  {  
    int iSize = 0;
    Scanner sobj = new Scanner(System.in);

    System.out.print("Enter the Size of an Array : ");
    iSize = sobj.nextInt();

    int Arr[] = new int[iSize];
    System.out.print("Enter the Element :");

    for(int i = 0;i<Arr.length;i++)
    {
      Arr[i] = sobj.nextInt();
    }
   int newArr[] =Secondapproach(Arr,iSize);

   for(int i =0;i<newArr.length;i++)
   {
    System.out.print(newArr[i]+"\t");
   }

  }
}