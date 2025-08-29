import java.util.Scanner;
class Base{
    public int CountN(int num[])
    {
       //int num[] = {1,-3,-5,-7,5};
       int iCnt = 0;
       int Counter = 0;

       for(iCnt = 0;iCnt<num.length;iCnt++){
        if(num[iCnt]<0){
            Counter++;
              }
         }
       return Counter;
    }
   
}
class CountOfNegativeNumber
{
    public static void main(String at[])
    {   
       Scanner bSc = new Scanner(System.in);
       int n = 0;
       System.out.println("Enter the Size of An Array:");
       n = bSc.nextInt();
       int Arr[] = new int[n];

       System.out.println("Enter the Elements in  Array:");
       for(int i =0 ;i<Arr.length;i++)
       {
          Arr[i] = bSc.nextInt(); 
         
       }
       System.out.println("Our Given Array is:");
       for(int i =0 ;i<Arr.length;i++)
       {
         System.out.print(Arr[i]+" ");
         
       }

        Base bobj = new Base();
        int Result = bobj.CountN(Arr);

        System.out.println("Count of Negative Number is:"+Result);

    }
}