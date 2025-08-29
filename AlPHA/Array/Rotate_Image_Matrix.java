//Problem Statement: Given a matrix, your task is to rotate the matrix 90 degrees clockwise.

/*
    Example 1:
Input:
 [[1,2,3],[4,5,6],[7,8,9]]

Output
: [[7,4,1],[8,5,2],[9,6,3]]

Explanation:
 Rotate the matrix simply by 90 degree clockwise and return the matrix.

 */
import java.util.Scanner;

class Matrix {
    int Arr[][];

    public Matrix(int iRow, int iCol) {
        Arr = new int[iRow][iCol];
    }

    // Function for Accepting the value for Matrix
    public void Accept() {

        Scanner sobj = new Scanner(System.in);
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr.length; j++) {

                Arr[i][j] = sobj.nextInt();
            }
        }
    }
   // Display Original Matrix
    public void Display() {
        System.out.println("Element of an Matrics :");
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr.length; j++) {

                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // take function for Rotating matrix   
    /*
     e another dummy matrix of n*n, and then take the first row of the matrix and put it in the last column of the dummy matrix, take the second row of the matrix, and put it in the second last column of the matrix and so. */ 
//     ime Complexity: O(N*N) to linearly iterate and put it into some other matrix.

// Space Complexity: O(N*N) to copy it into some other matrix.
    public int[][] Rotate()
    {   
        int n = Arr.length;
         
        //Step 1 : 
        int newArr[][] = new int[n][n]; // newArr for returning the new Array After roation

        for (int i = 0; i < newArr.length; i++) {

            for (int j = 0; j < newArr.length; j++) {

                //Step 2 : take first row first row and put it into last column and so on....

                newArr[j][n-i-1] = Arr[i][j];
                
            }
        }
        return newArr;
    }

    // Optimal Approach and reduce space complexity to O(1)
    /*
     * Time Complexity: O(N*N) + O(N*N).One O(N*N) is for transposing the matrix and the other is for reversing the matrix.

       Space Complexity: O(1).
     */
    /*
      approach:

          Step 1: Transpose the matrix. (transposing means changing columns to rows and rows to columns)

          Step 2: Reverse each row of the matrix.
     */
    public void Rotate1()
    {   
        
        for(int i = 0;i <Arr.length;i++)
        {
            for(int j=i+1;j < Arr[0].length;j++ )
            {
                int temp = Arr[i][j];
                Arr[i][j] = Arr[j][i];
                Arr[j][i] = temp;
            }
        }
        //Reverse Array
        for(int i = 0;i <Arr.length;i++)
        {   

            // we swap only one pair (n/2 )  beacuse middle element cant change from its position
            for(int j=0;j < Arr.length/2;j++ )
            {
                int temp = Arr[i][j];
                Arr[i][j] = Arr[i][Arr.length - 1 - j];
                Arr[i][Arr.length - 1 - j] = temp;
            }
        }

    }

}

public class Rotate_Image_Matrix {
    public static void main(String args[]) {
        int iRow = 0, iCol = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Number of Rows");
        iRow = sobj.nextInt();

        System.out.print("Enter the Number of Col ");
        iCol = sobj.nextInt();

        Matrix mobj = new Matrix(iRow, iCol);

        mobj.Accept();
        mobj.Display();
        // int newArr[][] = mobj.Rotate();

        // System.out.println("Element of an Matrics :");
        // for (int i = 0; i < newArr.length; i++) {
        //     for (int j = 0; j < newArr.length; j++) {

        //         System.out.print(newArr[i][j] + "\t");
        //     }
        //     System.out.println();
        // }

        mobj.Rotate1();
        mobj.Display();

    }

}
