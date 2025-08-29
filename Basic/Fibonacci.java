// in fibonacci Series ,next number is the sum of previoius two numbers
// 0 , 1,1,2,3,5,8,13,21,34


class Findnthfibo
{
    public int nthfibo(int n)
    {
     int f1 =1;
     int f2 =1;
     int f3 = 0;

     if( n == 1 || n == 2)
     {
        return 1;
     }
     for(int i=3;i<=n;i++)
     {
        f3 =f1+f2;
        f1 = f2;
        f2 =f3;
     }
     return f3;

    }
}
public class Fibonacci {
    // using recursion
    public static int Fibo(int no)
    {
       if( no ==0)
       {
        return 0;
       }
      else if(no == 1)
       {
        return 1;
       }
       else{
           return Fibo(no - 1) + Fibo(no - 2);
       }
    }
    public static void main(String args[])
    {
       System.out.println(Fibo(0));

       Findnthfibo fobj = new Findnthfibo();

       int iRet = fobj.nthfibo(6);
       System.out.println("Nth fibonacci number is :"+iRet);
    }
    
}
