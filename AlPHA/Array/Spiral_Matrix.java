/*Problem Statement: Given a Matrix, print the given matrix in spiral order. */

/*
 * Input: Matrix[][] = { { 1, 2, 3 },
	              { 4, 5, 6 },
		      { 7, 8, 9 } }
			    
Output: 1, 2, 3, 6, 9, 8, 7, 4, 5.
 */

 import java.util.Scanner;

 class Matrix
 {
     int Arr[][];
     public Matrix(int iRow,int iCol)
     {
         Arr = new int[iRow][iCol];
     }
 
     public void Accept()
     {     
       
        Scanner sobj = new Scanner(System.in);
         for (int i = 0; i < Arr.length; i++) {
             for (int j = 0; j < Arr.length; j++) {
 
                 Arr[i][j] = sobj.nextInt();
 
                 
             }
         }
     }
 
     public void Display()
     {      System.out.println("Element of an Matrics :");
         for (int i = 0; i < Arr.length; i++) {
             for (int j = 0; j < Arr.length; j++) {
 
              System.out.print(Arr[i][j]+"\t");
             }
             System.out.println();
         }
     }
     public void Spiral()
     {
        // We Move like Right->Bottom->Left->top
       
        int n = Arr.length -1 ; // no of rows
        int m = Arr[0].length -1; // no of columns
        int Right = n-1 , Bottom =m-1 ,Left = 0 ,Top = 0;

        while(  Top <= Bottom &&)
         
        
        
     }
 }
 
 public class Spiral_Matrix {
     public static void main(String args[])
     {   
         int iRow = 0,iCol = 0;
 
         Scanner sobj = new Scanner(System.in);
 
         System.out.print("Enter the Number of Rows");
         iRow = sobj.nextInt();
 
         System.out.print("Enter the Number of Col ");
         iCol  = sobj.nextInt();
 
 
         Matrix mobj = new Matrix(iRow,iCol);
 
         mobj.Accept();
         mobj.Display();
         mobj.transpose();
         mobj.Display();
     }
     
 }
 