public class
 BubbleSort {
    public static void BubbleSort(int Arr[])
    { 
        
       for(int i=0;i<Arr.length-1;i++)
       {
        for(int j=0;j<Arr.length-i-1;j++)
        {
            if(Arr[j] > Arr[j+1])
            { 
                int temp = Arr[j];
                

            }
        }
       }
    }
    public static void main(String args[])
    {
        int Arr[] = {4,1,5,2,3};

        BubbleSort(Arr);

        for(int x : Arr)
        {
            System.out.print(x+"\t");
        }
    }
}
