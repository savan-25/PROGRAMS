// substring is part of our string ,which formed by consequtive sequence of character
// substring(start,end); // ending index is not included
public class SubString {

    public static String substring(String str,int si,int ei)
    {
        String substr = "";
        for(int i=si;i<ei;i++)
        {
            substr +=str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        
    String str = "Hello World";

  //  System.out.println(substring(str,3,6));
    
    // there is no need to write such function we simply use substring method

   System.out.println( str.substring(0,4));
    }
}
