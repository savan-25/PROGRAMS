import java.util.ArrayList;
class SumUpperLowerT {
    // Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n) {
        // code here
          ArrayList<Integer> iobj = new ArrayList<>();
          
          int UpperSum = 0;
          int LowerSum = 0;
          
          for(int i=0;i<n;i++)
          {
              for(int j=0;j<n;j++)
              {
                  if(i <= j)
                  {
                      UpperSum += matrix[i][j];
                  }
                  if(i>=j)
                  {
                      LowerSum += matrix[i][j];
                  }
        
              }
          }
          iobj.add(UpperSum);
          iobj.add(LowerSum);
          
          return iobj;
    }


    public static void main(String args[])
    {  
        ArrayList<Integer> iobj = new ArrayList<>();
        int   N = 3 ;
       int mat[][] = {{6, 5, 4},
           {1, 2, 5},
           {7, 9, 7}};

           iobj = sumTriangles(mat,N);

           System.out.print(iobj+"\t");




    }
}