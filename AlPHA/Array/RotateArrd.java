class RotateArrd
{   
   public static void Rev(int Arr[],int start,int end)
    {

        while(start<end)
        {
            int temp = Arr[start];
            Arr[start] = Arr[end];
            Arr[end] = temp;

            start++;
            end--;
        }

    }
    public static void RotateD(int Arr[],int d,int n)
    {
        Rev(Arr,0,d- 1);
        Rev(Arr,d,n-1);
        Rev(Arr,0,n-1);
    }
    public static void main(String args[])
    {
        int Arr[] = {1,2,3,4,5};
        int d = 2;
        int n = Arr.length;

        RotateD(Arr,d,n);

        for(int i=0;i<Arr.length;i++)
        {
            System.out.print(Arr[i]+"\t");
        }
    }
}