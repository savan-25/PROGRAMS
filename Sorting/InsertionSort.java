/* Steps for insertion sort
 * 1. Start with the second element(index 1),because the first element is already sorted
 * 2. compare with elements before it
 * 3.if it is smaller ,shift the larger element one position to right
 * 4. insert the current element at correct position
 * 5. Repeat for all elements in the array.
 */

public class InsertionSort {

    public static void iSort(int Arr[])
    {
        for(int i=1;i<=Arr.length-1;i++)
        { 
            int ele = Arr[i];
            int j = i-1;

            // Shift element grater than key to one postion ahed\
            while(j>=0 && Arr[j] > ele)
            {
                Arr[j+1] = Arr[j];
                j--;
            }
            Arr[j+1] = ele;
        }
    }
    public static void main(String args[])
    {
        int Arr[] = {5,3,4,1};

        iSort(Arr);

        for(int i=0;i<Arr.length;i++)
       {
        System.out.print(Arr[i]+"\t");
       }

    }

}
