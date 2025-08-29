// Left Rotate array by d place
class RotateArraybyD
{   
    public static int[] Firstapproach(int Arr[],int n,int Rotation)
    {    
      // time complexity O(n)
      // space complexity O(1)  // if ask how much in algo then O(n)

      Rotation = Rotation % Arr.length;
      for( int j=0;j<Rotation;j++)
      {
      int temp = Arr[0];
      for(int i = 1;i<Arr.length ;i++)
      {
        Arr[i-1] = Arr[i];
      }
      Arr[n-1] = temp;
    }
      return Arr;
    }

    public static void main(String[] args) 
    {
       
    }
}