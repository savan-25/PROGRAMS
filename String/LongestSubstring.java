/*
  Write i Java Program to find Longest substring Length which doesnt
  contain repeating Character in given String

  Input : java
  Output : 3 -->jav

  Input : abbac
  Output : 3 --> bac
 */

//int Arr[] = {2,3,4,5,6,7,1}

class LongestSubstring
{
  public static void main(String[] args) {

    // try to find out using brute force
    int len = 0;
    String str = "Java";
    for(int i=0;i<str.length();i++)
    {
      char ch = str.charAt(i);
      for(int j=i+1;j<str.length();j++)
      {
           if(ch ==  str.charAt(j))
           {
            break;
           }
      }
    }
    
  }
}