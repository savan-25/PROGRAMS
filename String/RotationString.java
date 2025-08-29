  /*
     * Input: s1 = “abcd”, s2 = “cdab”
Output: true
Explanation: After 2 right rotations, s1 will become equal to s2.


Input: s1 = “aab”, s2 = “aba”
Output: true
Explanation: After 1 left rotation, s1 will become equal to s2.


Input: s1 = “abcd”, s2 = “acbd”
Output: false
Explanation: Strings are not rotations of each other.
     */
public class RotationString {
    public static void main(String args[])
    {
        String s1 = "abcd";
        String s2 = "cdab";

        boolean bRet = false;

        for(int i = 0;i<s1.length();i++)
        {
            if(s1.equals(s2))
            {
                bRet = true;
                break;
            }
            
            char temp = s1.charAt(s1.length()-1);
            s1 = temp + s1.substring(0, s1.length()-1);
        }

        System.out.println(bRet);
    }
}
