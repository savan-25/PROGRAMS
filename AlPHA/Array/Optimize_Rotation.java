
 class Optimize_Rotation {
    
    public static void RightRotate(int Arr[],int n,int d)
    {
        d = d % n;

        reverse(Arr,0,n-1); // Reverse the whole array
        reverse(Arr,0,d-1); // reverse the first half
        reverse(Arr,d,n-1);// reverse the second half

    }
    // 1 2 3 4
    // 4 3 2 1
    // 3 4 2 1
    // 3 4 1 2
    public static void reverse(int Arr[],int start,int end)
    {
        while( start < end)
        {
            int temp = Arr[start];
            Arr[start] = Arr[end];
            Arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int Arr[] = {1,2,3,4,5,6};

        RightRotate(Arr, 6, 2);

        for(int i=0;i<6;i++)
        {
            System.out.print(Arr[i]+"\t");
        }

    }
    
}
