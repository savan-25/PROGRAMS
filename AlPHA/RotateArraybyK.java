//  Program For Rotating Array By one place to Left
/*Example 1:
Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=1,Left
Output:  2 3 4 5 6 7 1
Explanation: array is rotated to Left By Postion 1
 */

//  Program For Rotating Array By one place to Right
/*Example 1:
Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=1,Right
Output:  7 1 2 3 4 5 6 
Explanation: array is rotated to Right By Postion 1
 */
public class RotateArraybyK 
{    
    // Function for Moving Left
    public static int[] MoveL1(int Arr[])
    {
        int temp = Arr[0]; //  we Know that Array is Rotated by one place so we take it in temp

        for(int i = 1;i<Arr.length;i++)
        {
            Arr[i- 1] = Arr[i];// Shifting left array by one plece

        }
        Arr[Arr.length -1] = temp;

        return Arr;
    }
    // Function for Moving Right
    public static int[] MoveR1(int Arr[])
    {   
        int temp = Arr[Arr.length-1];

        for(int i = Arr.length-1; i > 0;i--)
        {
            Arr[i] = Arr[i - 1]; // Shifting to 
        }
        Arr[0] = temp;

        return Arr;
    }
  public static void main(String args[])
  {   
    int Arr[] = {1,2,3,4};

    int newArr[] = MoveR1(Arr);

   System.out.println("Element of an Array Are:");
   for(int i = 0;i<newArr.length;i++)
   {
    System.out.print(newArr[i]+"\t");
   }
  }
    
}
