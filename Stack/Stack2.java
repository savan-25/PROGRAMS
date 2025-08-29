// Stack implementation  using array

class StackArray{
    
    public static int Arr[] = new int[10];
    public  static int top = -1;
   
    public void push(int x)
    {  
        try{
        if( top <= Arr.length )
        {
            top = top+1;
            Arr[top] = x;
        }
    }catch(ArrayIndexOutOfBoundsException eobj)
    {
          //System.out.println(eobj);
    }
    }
    public int pop()
    {
        if( top == -1)
        {
            return -1;
        }
        int Ans = Arr[top];

        top = top -1;

        return Ans;
    }
    public void Display()
    {
        for( int i =0 ;i<=top;i++)
        {
            System.out.println(Arr[i]+"\t");
        }
    }
}
class Stack2
{
    public static void main(String args[])
    {
       StackArray sobj = new StackArray();

       sobj.push(10);
       sobj.push(20);
       sobj.push(30);
       sobj.push(40);
       sobj.push(50);
       sobj.push(60);
       sobj.push(70);
       sobj.push(80);
       sobj.push(90);
       sobj.push(100);
      sobj.push(110); 

       sobj.Display();
    }
}