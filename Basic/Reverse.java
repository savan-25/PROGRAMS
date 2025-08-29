// Reverse a Number and is Palindrome or not

public class Reverse
{   
    public static void Reverse(int iNo)
    {
          int temp = iNo;
          int iDigit = 0;
          int iRev = 0;
          
          while( iNo > 0)
          {
            iDigit = iNo % 10;
            iRev = (iRev * 10)+iDigit;
            iNo = iNo / 10;
          }
          System.out.println("Reversed number is : "+iRev);
          if( temp == iRev )
          {
            System.out.println("it is palindrome ");
          }
          else{
            System.out.println("it is not palindrome");
          }
    }
    public static void main(String[] args) 
    {
        Reverse(121);
        
    }
}