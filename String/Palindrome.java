// check if String is Palindrome or not

// input = MaM  oputput - it is palindrome
//input = Savan  output = it is not palindrome

import java.util.Scanner;

public class Palindrome {
      
    // Best Way For Interiview

    public static boolean isPalindrome(String str)
    {   boolean bRet = true;
        for(int i = 0;i<str.length()/2;i++ )
        {
            int n = str.length();

            if(str.charAt(i) != str.charAt(n-1-i))
            {
                bRet = false;
                break;
            }
           
        }
        return bRet;
    }
    // Method 1
    public static boolean isPalindrome1(String str)
    {
        boolean bret = true;

        char Arr[] = str.toCharArray();

        int start = 0;
        int End = Arr.length - 1;

        while(start < End)
        {  
            if(Arr[start] != Arr[End])
            {
               bret = false;
            }
            start++;
            End --;
        }
        return bret;
    }
    // Method 2
    public static boolean isPalindrome2(String str)
    {
        StringBuilder newstr = new StringBuilder(str).reverse();

        return str.equals(newstr);

    }


    public static void main(String[] args) {

        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String :");
        String str = sobj.nextLine();

       // bRet = isPalindrome2(str);

        System.out.println(isPalindrome(str));
        



    }
}
