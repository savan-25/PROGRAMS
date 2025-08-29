// input : 7 
//arr : 4 1 1 1 2 3 5
//k : 5 
//Output : 4
import java.util.Scanner;
public class Longest_SubArray_of_SumK {
     
    // Brute force Approach
    public static int LongestSubArr(int Arr[],int k)
    {  
        int iSum = 0;
        int newCount = 0;
       for (int i = 0; i < Arr.length; i++) 
       { 
          iSum = 0;
          int iCount = 0;
         for (int j = i; j < Arr.length; j++)
        {
            iSum += Arr[j];
            iCount++;
            if(iSum == k)
            {
                newCount = Math.max(iCount, newCount);
                break;
            }
         }
       }
       return newCount;
    }
    // Using Sliding Window
    public static int LongestSubArr2(int Arr[],int k)
    {
        int iStart = 0,iEnd = 0;
        int iSum =0 , newCount = 0;
         
        while(iEnd < Arr.length)
        {
            //Expanding Window Size
            iSum +=Arr[iEnd];
            
            if(iSum == k)
            {
                newCount = Math.max(iEnd-iStart+1, newCount);
              
            }
            if(iSum > k)
            {
                while(iSum > k)
                {
                    iSum = iSum - Arr[iStart];
                    iStart++;
                }

            }
            iEnd++;
        }

        return newCount;
    }
    public static void main(String[] args) {

        int Arr[] = {4,1,1,1,2,3,5};
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Value of K");
        int K = sobj.nextInt();
        int Ans = LongestSubArr2(Arr,K);

        System.out.println("Count of Longest Subarray is : "+Ans);
        
    }
}
