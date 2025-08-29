import java.util.Scanner;
import java.util.ArrayList;

public class First_LastOccurence {
    public static ArrayList DPos(int Arr[],int target)
    {  
        int start = -1;
        int end = -1;
        int n = Arr.length-1;
         ArrayList<Integer> alist = new ArrayList<>();
        
         int mid = (Arr[0]+Arr[n])/2;

         while(start <=)
         return alist;
    }
    public static void main(String[] args) {
        ArrayList<Integer> alist = new ArrayList<>();
        Scanner sobj = new Scanner(System.in);
        int Arr[] = {5, 7, 7, 8, 8, 10};

        int target = 0;
        System.out.println("Enter the target Value : ");
        target = sobj.nextInt();

       alist = DPos(Arr,target);
       
       for(int x:alist)
       {
        System.out.print(x+"\t");
       }

    }
    
}
