public class SubArray_Sum {
    public static void main(String[] args) {
        
        int Arr[] = {1,2,3,4};
        
        for(int i = 0;i<Arr.length;i++)
        {    int Sum = 0;
            for(int j = i;j<Arr.length;j++)
            {     
                    Sum = Sum+Arr[j];
                    System.out.print(Sum+" ");
            }
            System.out.println();
        }
    }
}
