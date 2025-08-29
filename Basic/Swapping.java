
// Swapping of two numbers
public class Swapping {
    // using temp
    public static void Swap(int a,int b)
    {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Value of a is : "+a);
        System.out.println("Value of b is :"+b);
    }
    //using two variables 
    public static void Swap1(int a,int b)
    {
        a = a+b;
        b = a - b;
        b = a - b;

        System.out.println("Value of a is : "+a);
        System.out.println("Value of b is :"+b);
    }
    //using Xor 
    public static void Swap3(int a ,int b)
    {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Value of a is : "+a);
        System.out.println("Value of b is :"+b);
    }

    public static void main(String args[])
    {
         Swap3(23, 45);
    }
}
