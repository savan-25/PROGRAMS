// print first n fibonacci number
public class Fibo 
{   
   // using Iteration
   public static int Itr(int N)
   {
     // Handle base Case
     if(N == 0) return 0;
     if(N == 1) return 1;

     int f1 = 0;
     int f2 = 1;
     int f3 = 0;

     for(int i=2;i<=N;i++)
     {
      f3 = f1+f2;
      f1 = f2;
      f2 = f3;
     }
     return f3;
   }
    public static int Rec(int n)
    {
        if( n == 0)
        {
            return 0;
        }
        else if(n == 1)
        {
             return 1;
        }
        else{
            return  Rec(n-1) + Rec(n-2);

        } 
    }
  public static void fibo(int n)
  {
     int prev = 0;
     int prevprev ;
     int current = 1;


    
    for( int i = 0;i<n;i++)
    {  
       
      if( i ==0){
        System.out.println(i);
      }
      else if(i == 1)
      {
        System.out.println(i);
      }
      else
      {
       prevprev = prev;
       prev = current;
       current = prev + prevprev;

       System.out.println(current);
      }
    }

 
}
    public static void main(String args[])
    {
     int Ans = Itr(6);
     System.out.println(Ans);

    }
    
}
