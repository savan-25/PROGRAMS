import java.util.Scanner;

class Array2
{   
    int Average(int Arr[])
    {
       int iSum = 0;
       int Avg = 0;

       for( int i=0;i<Arr.length;i++)
       {
        iSum = iSum + Arr[i];
       }
       Avg = iSum / Arr.length;

       return Avg;

    }
    public static void main(String Arga[])
    {   
        Array2 aobj = new Array2();
        
        Scanner sobj =  new Scanner(System.in);
        int Size = 0;

        System.out.println("Enter the Size of An Array: ");
        Size = sobj.nextInt();
        
        int Arr[] = new int[Size];

        System.out.println("Enter the Element of An array:");
        for( int  i = 0;i<Size;i++)
        {
           Arr[i] = sobj.nextInt();
        }
        int iRet = aobj.Average(Arr);

        System.out.println("Average of Array Element is: "+iRet);
        
    }
}