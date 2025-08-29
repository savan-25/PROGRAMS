
// find out factorial of number using iteration

class Factorial{
    public static int Fact(int n)
    {
        if( n == 1) 
        {
            return 1;
        }

        return n *Fact(n-1);
    }
    public static int itr(int n)
    {
        int ifact = 1;

        for(int i=1;i<=n;i++)
        {
            ifact = ifact * i;
        }
        return ifact;
    }
    public static void main(String[] args) 
    {   
        System.out.println("Factorial of number using recursice approach :"+Fact(5));
        

        System.out.println("Factorial using iterative approach : "+itr(5));

        
    }

}
