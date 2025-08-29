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
    public void transpose()
    {
        
        for (int i = 0; i < Arr.length; i++) {
            for (int j = i+1; j < Arr.length; j++) {
                int temp = Arr[i][j];
                Arr[i][j] = Arr[j][i];
                Arr[j][i] = temp; 
            }
        }
    }
}

public class Transpose {
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
