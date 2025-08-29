class DigitRev
{  
  public static int Reverse(int no)
  {
    int iRev= 0;
    int iDigit ;
    

    while( no > 0)
    {
      iDigit = no % 10;
      iRev = iRev *10 + iDigit;
      no = no /10;
    }
      return iRev;
  }
  public static void main(String[] args) 
  {
     int iRet = Reverse(12469317);
     System.out.println(iRet);
  
  }
}