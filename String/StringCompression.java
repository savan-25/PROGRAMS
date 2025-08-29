//"aaabbcccdd"   "a3b2c3d2"

public class StringCompression {

    public static String Compression(String str)
    {
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
        Integer iCount = 1;
        
        while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1))
        {
            iCount++;
            i++;
        }
        newStr +=str.charAt(i);
        if(iCount > 1)
        {
           if(iCount > 1)
           {
            newStr += iCount.toString();
           }
        }
        }
        return newStr;
    }
    public static String Compression2(String str)
    {
        char ch[] = str.toCharArray();

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer iCount = 1;
            
            while(i< ch.length-1 && ch[i] == ch[i+1])
            {
                iCount++;
                i++;
            }
            sb.append(ch[i]);
            if(iCount > 1)
            {
                sb.append(iCount.toString());
            }
        }
        return sb.toString();
    }
    public static void main(String args[])
    {

        String str = "aaabbcccdd";
      
        String output = Compression2(str);

        System.out.println(output);

    }
    
}
