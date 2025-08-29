// Reverse String 

import java.util.Scanner;
import java.util.Stack;
class Reverse
{     

    // method 1
    public static String Rev1(String str)
    {  
        // if we use String then we not change in existing string 
        // every modificaiton is create new string and new memory

        String newstr = "";

        char Arr[] = str.toCharArray();

        for(int i = Arr.length-1;i >=0 ;i--)
        {
            newstr = newstr +Arr[i];
        }

        return newstr;
    }

    // mehod 2
    public static void Rev2(String str)
    {
        char ch[] = str.toCharArray();

        int start = 0;
        int End = ch.length-1;
      
        while(start < End)
        {
           char temp = ch[start];
           ch[start] = ch[End];
           ch[End] = temp; 

           start++;
           End--;
        }

        str = new String(ch);

        System.out.println(str);
    }
    // method 3 - using inbuilt method // stringBuilder class and StringBuffer class Provides the reverse method
    public static void Rev3(String str)
    {
        StringBuilder sb = new StringBuilder(str).reverse();

        System.out.println(sb.toString());
        /*
         * This approach converts the reversed StringBuilder into a String before printing, 
         * making it more consistent and practical for general use. Nice catch! Do you want to
         */
    }

    //method 4- using stack
    public static void Rev4(String str)
    {
        Stack<Character> sobj = new Stack<>();

        for(int i=0;i<str.length();i++)
        {
            sobj.push(str.charAt(i));
        }
        while(!sobj.isEmpty())
        {
            System.out.print(sobj.pop());
        }
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

           Rev4(str);


    }
}