import java.util.*;
class Array1
{   
    public static  int Largest(int Arr[])
    {
         int Large = 0;

         for(int i = 0;i<Arr.length;i++)
         {
            if( Large < Arr[i])
            {
                Large = Arr[i];
            }
         }
         return Large;
    }
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int Size = 0;
        System.out.println("How many Element you Want to add into array");
        Size  = sobj.nextInt();
        int Arr[] =  new int[Size];
        
        System.out.println("Enter the Element of an Array:");
        for( int i =0;i<Size;i++)
        {
            Arr[i] = sobj.nextInt();
        }
         
        int iRet = Largest(Arr);
        System.out.println("Largest Element in Array iS : "+iRet);
        

    }
}