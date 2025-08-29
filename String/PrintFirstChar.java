/*
 print the First Character of Each Word in String

 ex input : I Am An Enginner.I Am Trying to improve My Self Day by Day
 Output : I A A E I A T t i M S D b D
 */
public class PrintFirstChar {
      
    // First Approach
    public static void printFirstChar(String str)
    {
        for(int i =0;i<str.length();i++)
        {
            if(i==0)
            {
                System.out.print(str.charAt(i)+"\t");
            }
            else if(str.charAt(i) == ' ')
            {
                System.out.print(str.charAt(i+1)+"\t");
            }
        }
    }
    // Second Approach
    public static void PrintFirstChar2(String str)
    {
        int iStart = 0 ;
        int iEnd = 0;
        boolean isNewWord = true;

        for (int i = 0; i < str.length(); i++) 
        {   
            char ch = str.charAt(i);
            if(isNewWord && Character.isLetter(ch))
            {
                System.out.print(ch+"\t");
                isNewWord = false;
            }
            if(ch == ' ' || ch == '.' || ch == ',')
            {
                isNewWord = true;
            }
            
        }
    }
    public static void main(String args[])
    {
        String str = "I Am An Enginner.I Am Trying to improve My Self Day by Day";

        PrintFirstChar2(str);
    }
}
