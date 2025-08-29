
public class Paris_in_Array {
  
    public static void main(String args[])
    {
        int Arr[] = {2,4,6,8,10};

        for(int i =0;i<Arr.length;i++)
        {
            for(int j = i+1;j<Arr.length;j++)
            {
                System.out.print("("+Arr[i]+","+Arr[j]+")");
            }
            System.out.println();
        }
    }

}

// formula for total number of pairs
//  n(n-1)/2           example: n = 5;   5(5-1)/2 = 10

