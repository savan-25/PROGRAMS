// There is two questions is made one is roatate clockwise and another is rotate anticlockwise

import java.util.Scanner;

public class Rotate90 {

    // Rotate Clock wise  
     public static void RotateArr(int Arr[][])
  {
    for(int i=0;i<Arr.length;i++)
    {
      for(int j=i;j<Arr.length;j++)
      {
         int temp = Arr[i][j];
         Arr[i][j] = Arr[j][i];
         Arr[j][i] = temp;
      }
    }
      for(int i=0;i<Arr.length;i++)
    {
      for(int j=0;j<Arr[0].length/2 ;j++)
      {
         int temp = Arr[i][j];
         Arr[i][j] = Arr[i][Arr.length-1-j];
         Arr[i][Arr.length-1-j] = temp;
      }
    }
  }
  //Another method
  public static int[][] Rotate(int Arr[][],int iSize)
  {
    int newArr[][] = new int[iSize][iSize] ;

    for(int i=0;i<Arr.length;i++)
    {
        for(int j=0;j<Arr.length;j++)
        {
             newArr[j][Arr.length-i-1] = Arr[i][j];
        }
    }
    return newArr;
  }
    public static void main(String args[]) {
        Scanner sobj = new Scanner(System.in);
        int n = 0;
        System.out.println("Enter the Size of an Array :");
        n = sobj.nextInt();

        int Arr[][] = new int[n][n];


        System.out.print("Enter the element \t");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Arr[i][j] = sobj.nextInt();
            }
        }

        System.out.println("Elements of  an Array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
