//Reverse the Each Word in java
// java code
// avaj edoc

import java.nio.channels.Pipe.SourceChannel;

public class ReverseEachWord {
    
    // Approach 1
    public static void ReverseWord(String str)
    {    
        StringBuilder sb = new StringBuilder("");
        int start = 0;
        
        for(int i = 0;i<=str.length();i++)
        {    
            if(i == str.length() || str.charAt(i) == ' ')
            {  
                
                for(int j = i -1;j >=start;j--)
                {
                   sb.append(str.charAt(j));
                 }
               if (i < str.length()) {
                    sb.append(' ');
                }
                // Update start to the next word's beginning
                start = i + 1;
            }
        }

        System.out.println(sb.toString()); 
    } 
    // Approach 2 -> using inbuilt Method
    public static String ReverseEachWord(String str)
    {
        StringBuilder sb = new StringBuilder("");

        String [] words = str.split(" ");

        for(String word : words)
        {
            // reverse word
            for(int i = word.length()-1;i>=0;i-- )
            {
                sb.append(word.charAt(i));

                if (i < words.length - 1) {
                    sb.append(" ");
                }
            }
         
            
        }
        return sb.toString();
    }
    // Method 3
    public static String ReverseEachWord2(String str)
    {
        StringBuilder finalstr = new StringBuilder();
        StringBuilder tempstr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) 
        {
            char c = str.charAt(i);

            if(c == ' ')
            {
                finalstr = finalstr.append(tempstr).append(" ");
                tempstr.setLength(0);
            }
            else
            {
                tempstr.insert(0,c);
            }

        }
        finalstr = finalstr.append(tempstr);

        return finalstr.toString();
    }
    public static void main(String[] args) {
        String str = "java";

        StringBuilder sb = new StringBuilder("");
       
        for (int i = 0; i < str.length(); i++) 
        {
            sb.insert(0,str.charAt(i));
            
        }

        System.out.println(sb.toString());

    }
}
