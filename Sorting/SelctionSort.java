class SelectionSort
{   
    public static void SelectionSort1(int Arr[])
    { 
        int min = 0, temp = 0;
       for(int i=0;i<Arr.length-1;i++)
       {
         min = i;
        for(int j=i+1;j<Arr.length;j++)
        {
            if(Arr[j] < Arr[min])
            {
                min = j;

            }

        }
        if(min != i)
        {
            temp = Arr[i];
            Arr[i] = Arr[min];
            Arr[min] = temp; 
        }
       }
    }
    public static void main(String arg[])
    {
        int Arr[] = {1,4,5,2,3};

        SelectionSort1(Arr);

        for(int x:Arr)
        {
            System.out.println(x);
        }

    }
    
}
