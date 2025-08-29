/*
 Input Format:
 N = 4, array[] = {3, 1, 2, 4}, k = 6
 Result:
 2
 */


 class Count_SubArray
 {  
   public static int CountSubArray(int Arr[] , int iNo)
   {
     int iCount = 0;
     
 
     for (int i = 0; i < Arr.length; i++) {
       int Sum = 0;
       for (int j = i; j < Arr.length; j++) {
        
         Sum = Sum + Arr[j];
 
         if(Sum == iNo)
         {
           iCount++;
         }
         
       }
     }
     return iCount;
   }
   public static void main(String[] args) {
     
     int Arr[] =  {1,2,3};
     int iRet = CountSubArray(Arr, 3);
 
     System.out.println("Count of Subarray Sum is : "+iRet);
     
   }
 }