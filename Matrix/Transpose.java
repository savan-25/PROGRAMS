public class Transpose {
    public static void Transpose(int Arr[][],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp = Arr[i][j];
                Arr[i][j] = Arr[j][i];
                Arr[j][i] = temp;
        
            }
        }
    }
    public  static void main(String args[])
    {
            int   N = 3 ;
            int mat[][] =
             {
              {1,1,1},
             {2, 2, 2},
             {3,3,3}
            };
   
    }
    
}
