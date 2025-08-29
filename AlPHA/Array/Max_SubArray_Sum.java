/*
   Arr = { 1 , -2 , 6 , -1 , 3}
   1  1,-2  1,-2,6  1,-2,6,-1   1,-2,6,-1,3
 */

 /*
  * Another Same Type Example
    Size  7 
    Arr[] ={2,5,1,8,2,1}
    Window Size : 3
  */
public class Max_SubArray_Sum {
    
    public static int Max1(int Arr[])
    {
        int Max = 0;
        int Sum = 0;

        for(int i =0;i<Arr.length;i++)
        {   Sum = 0;
            for(int j=i;j<Arr.length;j++ )
            {
                Sum = Sum + Arr[j];
              // System.out.print(Sum+"\t");
                if(Sum > Max)
                {
                    Max = Sum;
                }
            }
        }
      
        return Max;
    }
    public static int Max2(int Arr[],int k)
    {  
        // Widow Size - k
        int iStart = 0;
        int iEnd = 0;

        int iSum = 0; // Current Window Sum
        int iMax = Integer.MIN_VALUE; // To track Sum

       while(iEnd < Arr.length-1)
       {     
            iSum += Arr[iEnd];

            // Check the Size is Equal to Window Size
            if(iEnd-iStart+1 == k)
            {
                iMax = Math.max(iMax,iSum);
                iSum -=Arr[iStart];
                iStart++;
            } 
            
              iEnd++;
       }
       return iMax;
    }
    // use another methos
    public static 
    public static void main(String args[])
    {   
        int Arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int Ans = Max2(Arr,3);

        System.out.println("Maxmimum SubArray Summation is :"+Ans);
    }
    
}

