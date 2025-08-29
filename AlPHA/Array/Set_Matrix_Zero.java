import java.util.Scanner;
class Matrix
{
   public int Arr[][];

   public Matrix(int iRow,int iCol)
   {
    Arr = new int[iRow][iCol];
   }

   public void Accept(){
    System.out.println("Enter the values : ");
    
    Scanner sobj = new Scanner(System.in);
    for(int i = 0;i<Arr.length;i++)
    {
      for(int j = 0;j<Arr[0].length;j++)
      {
        Arr[i][j] = sobj.nextInt();
      }
    }
   }
   public void Display(){
    System.out.println("Values of Array Are : ");
    
    
    for(int i = 0;i<Arr.length;i++)
    {
      for(int j = 0;j<Arr[0].length;j++)
      {
        System.out.print(Arr[i][j]+"\t");
      }
      System.out.println();
    }
   }

  public int[][] Rotate()
  {  
    int n = Arr.length;
    int newArr[][] = new int[n][n];
    for (int i = 0; i < Arr.length; i++) {
      for (int j = 0; j < Arr.length; j++) {

           newArr[j][n-i-1] = Arr[i][j]; 
        
      }
    }
    return newArr;
  }

  public void Rotate1()
  {
    for (int i = 0; i < Arr.length; i++) {
        for (int j = 0; j < Arr.length; j++) {
  
             int temp = Arr[j][i];
             Arr[j][i] = Arr[i][j];
             Arr[i][j] = temp;
             
          
        }
      }
      for (int i = 0; i < Arr.length; i++) {
        for (int j = 0; j < Arr.length; j++) {
          int temp = 0;

          temp = Arr[i][j];
        }
      }
  }


 
}
class Set_Matrix_Zero
{  
  public static void main(String[] args) {
    
  
  Scanner sobj = new Scanner(System.in);

  System.out.println("Enter the number of Row :");
  int iRow = sobj.nextInt();

  System.out.println("Enter the number of Columns :");
  int iCol = sobj.nextInt();

  Matrix mobj = new Matrix(iRow,iCol);

 mobj.Accept();
 mobj.Display();

 int newArr[][] = mobj.Rotate();

 System.out.println("Values of Array Are : ");
    
    
    for(int i = 0;i<newArr.length;i++)
    {
      for(int j = 0;j<newArr[0].length;j++)
      {
        System.out.print(newArr[i][j]+"\t");
      }
      System.out.println();
    }

  }

}