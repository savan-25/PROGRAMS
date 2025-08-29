// For a Given String Convert each the first letter of each word to uppercase
// hii ,i am savan
//op - Hii , I Am Savan

import java.util.Scanner;

public class FirstLetterUpperCase {

    public static String FirstLetterUpper(String str)
    {  
        StringBuilder sb = new StringBuilder("");
         
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
       for(int i = 1;i<str.length();i++)
       {
          if(str.charAt(i) == ' ' && i < str.length()-1)
          {
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
          }else{
            sb.append(str.charAt(i));
          }
       }

       return sb.toString();

    
    }
public static void main(String[] args) {
    

    StringBuilder str = new StringBuilder("");

    Scanner sobj = new Scanner(System.in);
   System.out.println("Enter the String : ");
    String input = sobj.nextLine();

    str.append(input);

    
   System.out.println("String Before Conversion : "+input);
    String sRev = FirstLetterUpper(input);

    System.out.println("String After Conversion : "+sRev);


}
    
}
