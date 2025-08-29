import java.util.*;

class First_Negative { // Q Print First Negative Number in each Window
                       // Size : 8
                       // Arr[] : {12 ,-1,-7,8,-16,30,16,28}
                       // Window Size :3
        
        
        // Using Brute Force
        public static void First_Neg1(int Arr[],int k)
        {  
          for (int i = 0; i <= Arr.length-k; i++) {
            boolean bRet = false;
            for (int j = i; j < i+k ; j++) {
                  if(Arr[j]<0)
                  { 
                  
                    System.out.print(Arr[j]+"\t");
                    bRet = true;
                    break;
                  }
            }
            if(!bRet){
              System.out.print(0+"\t");
            }
          }
        }
        
        public static void First_Neg(int Arr[],int k)
       {   
          int iStart = 0; // start of the widow
          int iEnd = 0;   // End of the Window
          Queue<Integer> queue = new LinkedList<Integer>();// queue for Storing negative number

         // Step 1 : check Array is Empty
         if(Arr.length == 0)
         {
          return ;
         }
         // Step : sliding window traversal
         while (iEnd < Arr.length-1) {
          //if Current Element is Negative , add it to the queue
          if(Arr[iEnd] < 0)
          {
            queue.offer(Arr[iEnd]);
          }
          
          //if Window Size is Reached
          if(iEnd - iStart + 1 == k)
          {
            //print the First -Ve number in the Current Window
            if(!queue.isEmpty())
            {
              System.out.println(queue.peek()+" ");
            }else{
              System.out.println("0");//no negative number
            }
            if(!queue.isEmpty() && queue.peek() == Arr[iStart])
            {
              queue.poll();
            }
            // Slide the window

            iStart++;
          }

          iEnd++;
         }
       }

    public static void main(String args[]) {
        int iSize = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Size of An Array");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];
        
        System.out.println("Enter the Element : ");
        for(int iCnt = 0;iCnt<iSize;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Enter the Window Size");
        int wSize = sobj.nextInt();

        First_Neg(Arr,wSize);

    }
}