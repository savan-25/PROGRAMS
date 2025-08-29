// Find Second Smallest number in Array

import javax.print.DocFlavor.INPUT_STREAM;

public class SecondSmall

{ 
  public static int SecondSmall(int Arr[])
  {
    int iSmall = Integer.MAX_VALUE;
    int iSecSmall = Integer.MAX_VALUE;

    for(int i =0;i<Arr.length;i++)
    {
      if( Arr[i] < iSmall){
        iSecSmall = iSmall;
        iSmall = Arr[i];
      }else if( Arr[i] < iSecSmall && Arr[i] != iSmall)
      {
        iSecSmall = Arr[i];
      }
    }
    if(iSecSmall == Integer.MAX_VALUE)
    {
      return-1;
    }
    return iSecSmall;
  }
  public static void main(String args[]) {
    int Arr[] = { 10,10,10,10 };
    System.out.println(SecondSmall(Arr));
  }
}