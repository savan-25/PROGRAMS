// Print the Subarray 
// Arr[] = {1,2,3,4,5}
/*  1                    2                 
    1 2                  2 3
    1 2 3                2 3 4
    1 2 3 4              2 3 4 5
    1 2 3 4 5
*/ 
public class Print_Subarray {

    public static void main(String arg[])
    {
        int Arr[] = {1,2,3,4,5};
         
        int n = Arr.length;
        System.out.println("Total number of Subarray : "+ (n*(n+1))/2);
        for(int i = 0;i<Arr.length;i++)
        {
            for(int j = i;j<Arr.length;j++)
            {
                for(int k = i;k<=j;k++)
                {
                    System.out.print(Arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
}
// sum of fist n number 
/*  [2,4,6,8,10]
    2   5
    4   4
    6   3
    8    2
    10   1
 */
// Total number of Subarray n(n+1)/2
