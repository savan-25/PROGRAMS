class Base
{
    // First Approach
    public int[] Move1(int Arr[])
    {
       int Brr[] = new int[Arr.length];

       int j = 0;
       for(int i = 0;i<Arr.length;i++)
       {
        if( Arr[i] != 0)
        {
            Brr[j] = Arr[i];
            j++;
        }
       }
      return Brr;
    }
    // Second Approch(best)
    public int[] Move2(int Arr[])
    {
        int j = 0;
        int len = Arr.length;
        for(int i =0;i<Arr.length;i++)
        {
            if( Arr[i] !=0)
            {
                Arr[j] = Arr[i];
                j++;
            }
        }
        
        while( j <len)
        {
            Arr[j] = 0;
            j++;
        }
        return Arr;
    }
}

public class MoveZeroEnd {
    public static void main(String[] args) {
        int Arr[] = {12,23,0,9,0,8};

        Base bobj = new Base();
       // int newArr[] = bobj.Move1(Arr);
       int newArr[] = bobj.Move2(Arr);
        System.out.println("Array After moving all Zero to End");
        for(int i = 0;i<newArr.length;i++)
        {
            System.out.println(newArr[i]+" ");
        }
    }
}
