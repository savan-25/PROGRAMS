/*Problem Statement: Given a circular integer array A, return the next greater element for every element in A.
 The next greater element for an element x is the first element greater than x that we come across while 
 traversing the array in a clockwise manner. 
If it doesn't exist, return -1 for this element. */
import java.util.*;
class acc
{   
    int Arr[] = new int[4];
    public static int Start = -1;
   public  void push(int a)
   {  
      if(Start <= Arr.length)
       Start = Start+1;
       Arr[Start] = a;
   }
   public void Display()
   {
    for(int i = 0;i<=Start;i++)
    {
        System.out.println(Arr[i]);
    }
   }
   public int pop()
   {
    if( Start == -1)
    {
        return -1;
    }
    int Ans = Arr[Start];
    Start--;

    return Ans;
   }
}
public class Stack5 {
    public static void main(String args[])
    {
     acc sobj = new acc();
     sobj.push(55);
     sobj.push(15);
     sobj.push(25);
     sobj.Display();
     System.out.println("poped Element is:"+sobj.pop());
     sobj.Display();
    }
    
}
